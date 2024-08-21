package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.Book;
import io.codeforall.bootcamp.harrypotter.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Book} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/book")
public class RestBookController {

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
     * Retrieves a representation of the list of books
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Book>> listBooks() {

        List<Book> book = bookService.list();

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given book
     *
     * @param id the book id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Book> showBook(@PathVariable Integer id) {

        Book book = bookService.get(id);

        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

}
