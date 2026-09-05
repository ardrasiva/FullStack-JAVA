package com.example.mobileshop.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mobileshop.Model.Mobileshop;
import com.example.mobileshop.Repository.MobileshopRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller 
public class MobileshopController {
    @Autowired
    private MobileshopRepository ms;
    
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("message", "Enter the details of the phone you want to add : ");
        return "create";
    }

    @PostMapping("/create")
    public String creation(Mobileshop m, Model model) {
        //TODO: process POST request
        ms.save(m);
        model.addAttribute("message", "Details of "+m.getName()+" is added successfully!");
        return "create";
    }
    @GetMapping("/all")
    public String getPhoneList(Model model) {

        List<Mobileshop> mobilelist = ms.findAll();
        model.addAttribute("listofphones", mobilelist);
        return "list";
    }
    
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id,Model model) {
        Optional<Mobileshop> optionalMobileDetails = ms.findById(id);
        if(optionalMobileDetails.isPresent())
        {
            model.addAttribute("Mobiledetails", optionalMobileDetails.get());
            return "update";
        }
        return "redirect:/all";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Integer id,Mobileshop m) {
        Optional<Mobileshop> optionalMobileDetails = ms.findById(id);
        if(optionalMobileDetails.isPresent())
        {
            Mobileshop msh = optionalMobileDetails.get();
            msh.setName(m.getName());
            msh.setDescription(m.getDescription());
            msh.setPrice(m.getPrice());

            ms.save(msh);
        }
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {

        Optional<Mobileshop> optionalPhoneDetails = ms.findById(id);
        if(optionalPhoneDetails.isPresent())
        {
            model.addAttribute("Mobiledetails", optionalPhoneDetails.get());
            return "delete";
        }
        return "redirect:/all";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        ms.deleteById(id);
        return "redirect:/all";
    }
    
    
    
    
    

    
}
