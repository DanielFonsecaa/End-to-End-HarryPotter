package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.Event;
import io.codeforall.bootcamp.harrypotter.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Event} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/event")
public class RestEventController {

    private EventService eventService;

    /**
     * Sets the event service
     *
     * @param eventService the event service to set
     */
    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Retrieves a representation of the list of events
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Event>> listEvent() {

        List<Event> event = eventService.list();

        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given event
     *
     * @param id the event id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Event> showEvent(@PathVariable Integer id) {

        Event event = eventService.get(id);

        if (event == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(event, HttpStatus.OK);
    }

}
