CREATE DATABASE BookStoreDB;

USE BookStoreDB;

CREATE TABLE `BookStoreDB`.`authors`(author_id INT(10) PRIMARY KEY AUTO_INCREMENT,
                                     name VARCHAR(25) NOT NULL,
                                     country VARCHAR(10));

CREATE TABLE `BookStoreDB`.`books`(book_id INT(10) PRIMARY KEY AUTO_INCREMENT,
                                     title VARCHAR(25) NOT NULL,
                                     price INT(10),
                                   author_id INT(10),
                                  FOREIGN KEY (author_id) REFERENCES authors(author_id));

ALTER TABLE books ADD published_year INT(4);

TRUNCATE TABLE books;

DROP DATABASE BookStoreDB;