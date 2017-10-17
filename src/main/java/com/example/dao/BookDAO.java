package com.example.dao;

import com.example.entity.Book;

import java.util.List;

public interface BookDAO {
    void addBook(Book book);

    void editBook (Book book);

    void deleteBook(int id);

    List<Book> getAllBooks();

    Book getBook(int id);

    List<Book> getBooksByTitle(String title);
}
