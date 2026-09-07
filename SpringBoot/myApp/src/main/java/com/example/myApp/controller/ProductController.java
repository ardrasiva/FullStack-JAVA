package com.example.myApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.myApp.Models.Product;
import com.example.myApp.Repository.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/create")
    public String create(Model model) {

        model.addAttribute(
            "message",
            "Enter the product details : "
        );

        return "create";
    }

    @PostMapping("/create")
    public String createProcess(
            Product p,
            Model model) {

        productRepository.save(p);

        model.addAttribute(
            "message",
            "Details of " + p.getName()
            + " is added successfully!"
        );

        return "create";
    }

    @GetMapping("/all")
    public String getAllProducts(
            Model model,
            @Param("keyword") String keyword) {

        List<Product> products;

        if (keyword != null && !keyword.isEmpty()) {

            products =
                productRepository.findAllByKeyword(keyword);

        } else {

            products =
                productRepository.findAll();
        }

        model.addAttribute("products", products);

        return "list";
    }

    @GetMapping("/update/{id}")
    public String update(
            @PathVariable Integer id,
            Model model) {

        Optional<Product> optionalProduct =
            productRepository.findById(id);

        if (optionalProduct.isPresent()) {

            model.addAttribute(
                "ProductDetails",
                optionalProduct.get()
            );

            return "update";
        }

        return "redirect:/all";
    }

    @PostMapping("/update/{id}")
    public String update(
            @PathVariable Integer id,
            Product p) {

        Optional<Product> optionalProduct =
            productRepository.findById(id);

        if (optionalProduct.isPresent()) {

            Product product =
                optionalProduct.get();

            product.setName(p.getName());
            product.setDescription(p.getDescription());
            product.setPrice(p.getPrice());
            product.setExpirydate(p.getExpirydate());

            productRepository.save(product);
        }

        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable Integer id,
            Model model) {

        Optional<Product> optionalProduct =
            productRepository.findById(id);

        if (optionalProduct.isPresent()) {

            model.addAttribute(
                "ProductDetails",
                optionalProduct.get()
            );

            return "delete";
        }

        return "redirect:/all";
    }

    @PostMapping("/delete/{id}")
    public String delete(
            @PathVariable Integer id) {

        productRepository.deleteById(id);

        return "redirect:/all";
    }
}