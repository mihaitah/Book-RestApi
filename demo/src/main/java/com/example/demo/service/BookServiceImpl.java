package com.example.demo.service;

import com.example.demo.models.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{

    @Override
    public Book getById(int bookid){
        return getBooksList()
                .stream()
                .filter((book)->book.getBookid()==bookid)
                .findAny()
                .orElse(new Book());

    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return getBooksList()
                .stream()
                .filter((book)->book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }


    @Override
    public List<Book> getBooksByCategory(String category) {
        return getBooksList()
                .stream()
                .filter((book)->book.getCategory().equals(category))
                .collect(Collectors.toList());
    }




    //books list
    private List<Book> getBooksList(){
        return Arrays.asList(
                new Book("Java","Katty Jackson","Tech",1),
                new Book("Spring","Rod Anton","Tech",2),
                new Book("Ferrari","Kat Botegh","Cars",3),
                new Book("Best Pancakes","Michael Kos","Cooking",4),
                new Book("Perfect Pasta Recipe","Katty Elevenate","Cooking",5),
                new Book("Banana Bread Recipe","Rodyos Eva","Cooking",6),
                new Book("Kcal /100g","Dr. Smith","Cooking",7),
                new Book("Football Players","BBC","Magazines",8),
                new Book("PrinceHarry","Catalina","Magazines",9),
                new Book("The Lions","Radu","Documentary",10),
                new Book("Safari","Katty Blum","Documentary",11),
                new Book("Spring in Africa","Anne Marie","Documentary",12));
    }



































}
