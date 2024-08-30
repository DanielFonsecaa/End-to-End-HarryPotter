package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.BookDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    /**
     * Sets the book data access object
     *
     * @param bookDao the account DAO to set
     */
    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * @see BookService#get(Integer)
     */
    @Override
    public Book get(Integer id) {
        return bookDao.findById(id);
    }


    /**
     * @see BookService#list()
     */
    @Override
    public List<Book> list() {
        return bookDao.findAll();
    }

}

