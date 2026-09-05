package com.example.mobileinventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mobileinventory.Model.Mobileinventory;
import com.example.mobileinventory.Repository.MobileinventoryRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller 
public class MobileinventoryController {

    @Autowired 
    private MobileinventoryRepository mir;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("message", "Enter the phone details : ");
        return "create";
    }

    @PostMapping("/create")
    public String createProcess(Mobileinventory mi, Model model) {
        
        mir.save(mi);
        model.addAttribute("message", "Details about "+mi.getPhoneName()+" is added successfully!");
        return "create";
    }

    @GetMapping("/all")
    public String displayCustomQueries(Model model) {

        List<Object[]> namesAndPrices = mir.getNameAndPrice();
        List<Mobileinventory> phonesBelow20k = mir.getPhonesBelow20k();
        List<Object[]> typeAndCount = mir.getCountOfType();

        model.addAttribute("namesAndPrices", namesAndPrices);
        model.addAttribute("phonesBelow20k", phonesBelow20k);
        model.addAttribute("typeAndCount", typeAndCount);

        return "list";
    }
    
    
    
    
}
