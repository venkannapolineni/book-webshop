package com.hackathon.service;

import com.hackathon.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
   List<Book> searchBookByTitle(String title);

   List<Book> searchBookByAuthor(String author);

   List<Book> searchBookByCategory(String category);
}
