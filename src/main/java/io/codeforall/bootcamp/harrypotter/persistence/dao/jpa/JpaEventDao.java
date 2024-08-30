package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;

import io.codeforall.bootcamp.harrypotter.persistence.dao.EventDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEventDao extends GenericJpaDao<Event> implements EventDao {
    public JpaEventDao() {
        super(Event.class);
    }
}