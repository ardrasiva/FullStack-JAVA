package com.example.localshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.localshop.exceptions.LocalshopNotFoundException;
import com.example.localshop.model.Localshop;
import com.example.localshop.Repository.LocalshopRepository;

@RestController
@CrossOrigin
public class LocalshopAPIController {

    @Autowired
    private LocalshopRepository lr;

    // CREATE
    @PostMapping("/api/addproduct")
    public Localshop addProduct(@RequestBody Localshop newProduct) {
        return lr.save(newProduct);
    }

    // READ ALL
    @GetMapping("/api/listproduct")
    public List<Localshop> getAllProducts() {
        return lr.findAll();
    }

    // READ ONE
    @GetMapping("/api/product/{id}")
    public Localshop getProductById(@PathVariable Integer id) {

        Optional<Localshop> product = lr.findById(id);

        if (product.isPresent()) {
            return product.get();
        }

        throw new LocalshopNotFoundException(id);
    }

    // UPDATE
    @PutMapping("/api/updateproduct/{id}")
    public Localshop updateProduct(
            @PathVariable Integer id,
            @RequestBody Localshop newProduct) {

        Optional<Localshop> product = lr.findById(id);

        if (product.isPresent()) {

            Localshop existingProduct = product.get();

            existingProduct.setName(newProduct.getName());
            existingProduct.setDescription(newProduct.getDescription());
            existingProduct.setPrice(newProduct.getPrice());
            existingProduct.setExpirydate(newProduct.getExpirydate());
            existingProduct.setCategory(newProduct.getCategory());
            existingProduct.setStock(newProduct.getStock());

            return lr.save(existingProduct);
        }

        throw new LocalshopNotFoundException(id);
    }

    // DELETE
    @DeleteMapping("/api/deleteproduct/{id}")
    public String deleteProduct(@PathVariable Integer id) {

        if (lr.existsById(id)) {
            lr.deleteById(id);
            return "product deleted successfully";
        }

        throw new LocalshopNotFoundException(id);
    }

    // SEARCH
    @GetMapping("/api/search")
    public List<Localshop> searchProducts(
            @RequestParam String keyword) {

        return lr.findAllByKeyword(keyword);
    }
}