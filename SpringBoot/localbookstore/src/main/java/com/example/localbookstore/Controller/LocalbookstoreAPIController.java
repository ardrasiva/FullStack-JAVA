package com.example.localbookstore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.localbookstore.Exceptions.LocalbookstoreNotFoundException;
import com.example.localbookstore.Model.Localbookstore;
import com.example.localbookstore.Repository.LocalbookstoreRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@CrossOrigin 
public class LocalbookstoreAPIController {  
    @Autowired 
    private LocalbookstoreRepository lsr;
    
    @PostMapping("/api/addbook")
    public Localbookstore addBook(@RequestBody Localbookstore newBook) {
        
        return lsr.save(newBook);
    }
    @GetMapping("/api/listbook")
    public List<Localbookstore> getAllBooks() {
        return lsr.findAll();
    }

    @GetMapping("/api/book/{id}")
    public Localbookstore getBookById(@PathVariable Integer id) {

        Optional<Localbookstore> book = lsr.findById(id);

        if (book.isPresent()) {
            return book.get();
        }

        throw new LocalbookstoreNotFoundException(id);
    }
    @PutMapping("/api/updatebook/{id}")
    public Localbookstore updateBook(@PathVariable Integer id, @RequestBody Localbookstore newBook) {

        Optional<Localbookstore> book = lsr.findById(id);
        if (book.isPresent()) {
            Localbookstore existingBook = book.get();
            existingBook.setTitle(newBook.getTitle());
            existingBook.setAuthor(newBook.getAuthor());
            existingBook.setGenre(newBook.getGenre());
            existingBook.setPrice(newBook.getPrice());
            existingBook.setPublishedDate(newBook.getPublishedDate());

            return lsr.save(existingBook);
        }

        throw new LocalbookstoreNotFoundException(id);
    }

    @DeleteMapping("/api/deletebook/{id}")
    public String deleteBook(@PathVariable Integer id) {

        if (lsr.existsById(id)) {
            lsr.deleteById(id);
            return "book deleted successfully";
        }

        throw new LocalbookstoreNotFoundException(id);
    }

   
    @GetMapping("/api/search")
    public List<Localbookstore> searchBooks(@RequestParam String keyword) {

        return lsr.findAllByKeyword(keyword);
    }
    
}
