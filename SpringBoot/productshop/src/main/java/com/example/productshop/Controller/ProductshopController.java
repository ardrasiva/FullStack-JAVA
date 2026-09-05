package com.example.productshop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.productshop.Model.Productshop;
import com.example.productshop.Repository.ProductshopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller 
public class ProductshopController {
    @Autowired
    private ProductshopRepository psr;
    
    @GetMapping("/create")
    public String create(Model model) {

        model.addAttribute("message", "Enter the details of the product : ");
        return "create";
    }

    @PostMapping("/create")
    public String postMethodName(Productshop ps, Model model) {
        psr.save(ps);
        model.addAttribute("message", "Details of "+ps.getName()+" is added successfully!");
        
        return "create";
    }
    

    @GetMapping("/all")
    public String getAllProducts(Model model) {
        List<Productshop> productList = psr.findAll();
        model.addAttribute("productList", productList);
        return "list";
        
    }
    
    

    
}
