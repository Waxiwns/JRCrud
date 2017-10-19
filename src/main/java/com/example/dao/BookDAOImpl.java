package com.example.dao;

import com.example.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
    }

    public void deleteBook(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = session.load(Book.class, id);
        if (book != null){
            session.delete(book);
        }
    }
    @SuppressWarnings("unchecked")
    public List<Book> getAllBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> books = session.createQuery("from Book").list();
        return books;
    }

    public Book getBook(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        return book;
    }

    public List<Book> getBooksByTitle(String title) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> allBooks = session.createQuery("from Book").list();
        List<Book> books = new ArrayList<Book>();

        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            if (book.getTitle().toLowerCase().contains(title.toLowerCase()))
            books.add(book);
        }

        return books;
    }
}
