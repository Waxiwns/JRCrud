package com.example.dao;

import com.example.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    public void addBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(book);
    }

    public void editBook(Book book) {

    }

    public void deleteBook(int id) {

    }

    public List<Book> getAllBooks() {
        return null;
    }

    public Book getBook(int id) {
        return null;
    }

    public List<Book> getBooksByTitle(String title) {
        return null;
    }
}
