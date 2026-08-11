CREATE DATABASE GroceryShop;

USE GroceryShop;

CREATE TABLE `GroceryShop`.`products`(product_id INT(10) AUTO_INCREMENT PRIMARY KEY,
                      product_name VARCHAR(20) NOT NULL,
                      price INT(10));


ALTER TABLE products ADD category VARCHAR(20);

TRUNCATE TABLE products;

DROP DATABASE GroceryShop;
