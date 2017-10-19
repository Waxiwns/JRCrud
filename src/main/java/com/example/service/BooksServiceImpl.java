package com.example.service;

import com.example.dao.BookDAO;
import com.example.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    private BookDAO bookDAO;

    public void setBookDAO(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @Transactional
    public void addBook(Book book) {
        this.bookDAO.addBook(book);
    }


    @Transactional
    public void editBook(Book book) {
        this.bookDAO.editBook(book);
    }


    @Transactional
    public void deleteBook(long id) {
        this.bookDAO.deleteBook(id);
    }

    @Transactional
    public List<Book> getAllBooks() {
        return this.bookDAO.getAllBooks();
    }

    @Transactional
    public Book getBook(long id) {
        return this.bookDAO.getBook(id);
    }

    @Transactional
    public List<Book> getBooksByTitle(String title) {
        return this.bookDAO.getBooksByTitle(title);
    }
}
