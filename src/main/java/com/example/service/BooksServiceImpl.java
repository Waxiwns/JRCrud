package com.example.service;

import com.example.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    public int addBook(Book book) {
        return 1;
    }

    public Book editBook(Book book) {
        return book;
    }

    public void deleteBook(int id) {

    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        for (int i = 0; i < 30; i++) {
            Book book = new Book();
            book.setId(i + 1);
            book.setTitle("Konan" + i);
            book.setDescription("Holmes" + i);
            book.setAuthor("asdfdsaf" + i);
            book.setIsbn(100);
            book.setPrintYear(1980 + i);
            book.setReadAlready(false);
            books.add(book);
        }
        return books;
    }

    public Book getBook(int id) {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Konan");
        book.setDescription("Holmes");
        book.setAuthor("asdfdsaf");
        book.setIsbn(100);
        book.setPrintYear(1980);
        book.setReadAlready(false);
        return book;
    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> books = new ArrayList<Book>();
        for (int i = 0; i < 30; i++) {
            Book book = new Book();
            book.setId(i + 1);
            book.setTitle("Konan" + i);
            book.setDescription("Holmes" + i);
            book.setAuthor("asdfdsaf" + i);
            book.setIsbn(100);
            book.setPrintYear(1980 + i);
            book.setReadAlready(false);
            books.add(book);
        }
        return books;
    }
}
