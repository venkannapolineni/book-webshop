package com.hackathon.service;

import com.hackathon.exceptions.BookNotFoundException;
import com.hackathon.model.Book;
import com.hackathon.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> searchBookByTitle(String title) {

        Optional<List<Book>> bookDb = Optional.ofNullable(this.bookRepository.findBookByTitle());

        if (bookDb.isPresent()) {
            return bookDb.get();
        } else {
            throw new BookNotFoundException("Record not found with title : " + title);
        }
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {

        Optional<List<Book>> bookDb = Optional.ofNullable(this.bookRepository.findBookByAuthor());

        if (bookDb.isPresent()) {
            return bookDb.get();
        } else {
            throw new BookNotFoundException("Record not found with author : " + author);
        }
    }

    @Override
    public List<Book> searchBookByCategory(String category) {
        Optional<List<Book>> bookDb = Optional.ofNullable(this.bookRepository.findBookByCategory());

        if (bookDb.isPresent()) {
            return bookDb.get();
        } else {
            throw new BookNotFoundException("Record not found with category : " + category);
        }
    }
}
