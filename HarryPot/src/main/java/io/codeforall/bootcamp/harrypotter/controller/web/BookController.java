package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.Book;
import io.codeforall.bootcamp.harrypotter.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for rendering {@link Book} related views
 */
@Controller
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    /**
     * Sets the book service
     *
     * @param bookService the book service to set
     */
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }


    /**
     * Renders a view with a list of books
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.list());
        return "book/list";
    }

    /**
     * Renders a view with book details
     *
     * @param id    the book id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showBook(@PathVariable Integer id, Model model) throws Exception {


        //Book book = eventService.get(id);

        // command objects for book show view
        model.addAttribute("book", bookService.get(id));

        return "book/show";
    }

}
