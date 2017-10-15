package com.example.service;

import com.example.entity.Book;

import java.util.List;


public interface BooksService {

    int addBook(Book book);
    Book editBook (Book book);
    void deleteBook(int id);
    List<Book> getAllBooks();
    Book getBook(int id);
    List<Book> getBooksByTitle(String title);
}
