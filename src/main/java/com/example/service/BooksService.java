package com.example.service;

import com.example.entity.Book;

import java.util.List;


public interface BooksService {

    void addBook(Book book);
    void editBook (Book book);
    void deleteBook(long id);
    List<Book> getAllBooks();
    Book getBook(long id);
    List<Book> getBooksByTitle(String title);
}
