package com.example.bookshop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.bookshop.Model.Bookshop;
import com.example.bookshop.Repository.BookshopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class BookshopController {
    @Autowired 
    private BookshopRepository br;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("message","Enter the book details : ");
        return "create";
    }
    @PostMapping("/create")
    public String createProcess(Bookshop bs, Model model) {
        br.save(bs);
        model.addAttribute("message", "Details of "+bs.getTitle()+" is added successfully!");
        
        return "create";
    }

    @GetMapping("/all")
    public String getAllBooks(Model model) {
        List<Bookshop> bookList = br.findAll();
        model.addAttribute("booklist", bookList);
        return "list";
    }
    
    
    
    
}
