package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.EventDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventDao eventDao;

    /**
     * Sets the event data access object
     *
     * @param eventDao the account DAO to set
     */
    @Autowired
    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    /**
     * @see EventService#get(Integer)
     */
    @Override
    public Event get(Integer id) {
        return eventDao.findById(id);
    }


    /**
     * @see EventService#list()
     */
    @Override
    public List<Event> list() {
        return eventDao.findAll();
    }

}

