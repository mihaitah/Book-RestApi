package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book-restapi")
public class BookController {

    @Autowired
    BookService bookService;
    //http://localhost:8080/book-restapi/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to RestAPI";
    }
    //http://localhost:8080/book-restapi/books-by-id/5
    @GetMapping("/books-by-id/{id}")
    public Book getBookById(@PathVariable("id") int bookid){
        return bookService.getById(bookid);
    }
    //http://localhost:8080/book-restapi/books-by-author/Michael Kos
    @GetMapping("/books-by-author/{author}")
    public List<Book> getBookByAuthor(@PathVariable("author") String author){
        return bookService.getBooksByAuthor(author);
    }

    //http://localhost:8080/book-restapi/books-by-category?category=Fiction
    @GetMapping("/books-by-category")
    public List <Book> getBookByCategory(@RequestParam("category") String category){
        return bookService.getBooksByCategory(category);
    }


}
