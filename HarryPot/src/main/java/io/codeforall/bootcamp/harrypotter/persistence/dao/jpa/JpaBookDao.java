package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;


import io.codeforall.bootcamp.harrypotter.persistence.dao.BookDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBookDao extends GenericJpaDao<Book> implements BookDao {
    public JpaBookDao() {
        super(Book.class);
    }
}