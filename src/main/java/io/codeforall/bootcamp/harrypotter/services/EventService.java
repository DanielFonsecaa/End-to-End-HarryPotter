package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.Event;

import java.util.List;

/**
 * Common interface for event services, provides methods to manage events
 */
public interface EventService {

    /**
     * Gets the event with the given id
     *
     * @param id the event id
     * @return the event
     */
    Event get(Integer id);

    /**
     * Gets a list of the events
     *
     * @return the events list
     */
    List<Event> list();

}
