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
//        List<Book> books = new ArrayList<Book>();
//        for (int i = 0; i < 30; i++) {
//            Book book = new Book();
//            book.setId(i + 1);
//            book.setTitle("Konan" + i);
//            book.setDescription("Holmes" + i);
//            book.setAuthor("asdfdsaf" + i);
//            book.setIsbn(100);
//            book.setPrintYear(1980 + i);
//            book.setReadAlready(false);
//            books.add(book);
//        }
//        return books;
        return this.bookDAO.getAllBooks();
    }

    @Transactional
    public Book getBook(long id) {
//        Book book = new Book();
//        book.setId(1);
//        book.setTitle("Konan");
//        book.setDescription("Holmes");
//        book.setAuthor("asdfdsaf");
//        book.setIsbn(100);
//        book.setPrintYear(1980);
//        book.setReadAlready(false);
//        return book;
        return this.bookDAO.getBook(id);
    }

    @Transactional
    public List<Book> getBooksByTitle(String title) {
//        List<Book> books = new ArrayList<Book>();
//        for (int i = 0; i < 30; i++) {
//            Book book = new Book();
//            book.setId(i + 1);
//            book.setTitle("Konan" + i);
//            book.setDescription("Holmes" + i);
//            book.setAuthor("asdfdsaf" + i);
//            book.setIsbn(100);
//            book.setPrintYear(1980 + i);
//            book.setReadAlready(false);
//            books.add(book);
//        }
//        return books;
        return this.bookDAO.getBooksByTitle(title);
    }
}
