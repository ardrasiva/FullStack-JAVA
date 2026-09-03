package com.example.grocery.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.grocery.Model.Product;


@Controller
public class ProductController {

    @GetMapping("/single-product")
    public String singleProduct(Model model) {
        Product p = new Product(101,"Sugar",55.5f);
        model.addAttribute("Product", p);
        return "single-product";
    }

    @GetMapping("/product-list")
    public String productList(Model model) {
        Product p1 = new Product(101, "Sugar", 55.5f);
        Product p2 = new Product(102, "Salt", 20.0f);
        Product p3 = new Product(103, "Wheat Flour", 38.75f);

        List<Product> productlist = new ArrayList<>();
        productlist.add(p1);
        productlist.add(p2);
        productlist.add(p3);

        model.addAttribute("listproduct", productlist);
        return "product-list";
    }
    
}
