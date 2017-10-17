package com.example.dao;

import com.example.entity.Book;

import java.util.List;

public interface BookDAO {
    void addBook(Book book);

    void editBook (Book book);

    void deleteBook(long id);

    List<Book> getAllBooks();

    Book getBook(long id);

    List<Book> getBooksByTitle(String title);
}
