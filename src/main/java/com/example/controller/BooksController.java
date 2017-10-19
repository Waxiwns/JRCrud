package com.example.controller;

import com.example.entity.Book;
import com.example.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BooksController {

    private static final int PAGE_ITEMS_COUNT = 10;

    @Autowired(required = true)
    @Qualifier(value = "bookService")
    private BooksService service;

    @RequestMapping(value="/")
    public ModelAndView getBooks(@RequestParam(required = false) Integer page) {
        ModelAndView modelAndView = new ModelAndView("books");
        List<Book> allBooks = service.getAllBooks();
        PagedListHolder<Book> pagedListHolder = new PagedListHolder<Book>(allBooks);
        pagedListHolder.setPageSize(PAGE_ITEMS_COUNT);
        modelAndView.addObject("maxPages", pagedListHolder.getPageCount());

        if(page == null || page < 1 || page > pagedListHolder.getPageCount()){
            page=1;
        }
        modelAndView.addObject("page", page);
        if(page == null || page < 1 || page > pagedListHolder.getPageCount()){
            pagedListHolder.setPage(0);
            modelAndView.addObject("books", pagedListHolder.getPageList());
        }
        else if(page <= pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(page-1);
            modelAndView.addObject("books", pagedListHolder.getPageList());
        }
        return modelAndView;
    }

    @RequestMapping("add")
    public ModelAndView addBook(@ModelAttribute Book book) {
        return new ModelAndView("add_book");
    }

    @RequestMapping("editQuestion")
    public ModelAndView editQuestionBook(@RequestParam long id, @ModelAttribute Book book) {
        book = service.getBook(id);
        ModelAndView modelAndView;
        if (!book.isReadAlready()){
            modelAndView = new ModelAndView("edit_question");
            modelAndView.addObject("book", book);
        }
        else {
            modelAndView = new ModelAndView("edit_book");
            modelAndView.addObject("book", book);
        }
        return modelAndView;
    }

    @RequestMapping("edit")
    public ModelAndView editBook(@RequestParam long id, @ModelAttribute Book book) {
        book = service.getBook(id);
        ModelAndView modelAndView;
        modelAndView = new ModelAndView("edit_book");
        modelAndView.addObject("book", book);
        return modelAndView;
    }

    @RequestMapping("editRead")
    public ModelAndView editReadBook(@RequestParam long id, @ModelAttribute Book book) {
        book = service.getBook(id);
        ModelAndView modelAndView;

            modelAndView = new ModelAndView("edit_readbook");
            modelAndView.addObject("book", book);

        return modelAndView;
    }

    @RequestMapping("save")
    public ModelAndView saveBook(@ModelAttribute Book book) {
        if(book.getId() == 0){ // if book id is 0 then creating book other updating book
            service.addBook(book);
        } else {
            service.editBook(book);
        }
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("delete")
    public ModelAndView deleteBook(@RequestParam long id)
    {
        service.deleteBook(id);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("search")
    public ModelAndView searchBook(@RequestParam("queryTitle") String queryTitle){
        List<Book> books = new ArrayList<Book>();
        if (queryTitle != "") {
            books = service.getBooksByTitle(queryTitle);
        }

        return new ModelAndView("books", "books", books);
    }
}
