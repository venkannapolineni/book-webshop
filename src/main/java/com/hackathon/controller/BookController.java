package com.hackathon.controller;

import com.hackathon.model.Book;
import com.hackathon.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books/{title}")
    public List<Book> searchBooksByTitle(@PathVariable(value = "title") String title) {
        return bookService.searchBookByTitle(title); // queries database for all books;
    }


    @GetMapping("/books/{author}")
    public List<Book> searchBooksByAuthor(@PathVariable(value = "author") String author) {
        return bookService.searchBookByAuthor(author); // queries database for all books;
    }

    @GetMapping("/books/{subject_category}")
    public List<Book> searchBooksByCategory(@PathVariable(value = "subject_category") String subject_category) {
        return bookService.searchBookByCategory(subject_category); // queries database for all books;
    }
}
