package com.example.chapter19.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.chapter19.Models.Product;
import com.example.chapter19.Repository.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public String getAllProducts(Model model) {

        List<Product> products = productRepository.findAll();

        model.addAttribute("products", products);

        return "list";
    }
}