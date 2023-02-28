package com.example.demo.service;

import com.example.demo.models.Book;

import java.util.List;

public interface BookService {

    Book getById(int bookid);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByCategory(String category);


}
