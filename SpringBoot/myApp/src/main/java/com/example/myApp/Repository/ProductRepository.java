package com.example.myApp.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.myApp.Models.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

}