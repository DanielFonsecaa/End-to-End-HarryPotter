package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.Book;

import java.util.List;

/**
 * Common interface for book services, provides methods to manage books
 */
public interface BookService {

    /**
     * Gets the book with the given id
     *
     * @param id the book id
     * @return the book
     */
    Book get(Integer id);

    /**
     * Gets a list of the books
     *
     * @return the books list
     */
    List<Book> list();

}
