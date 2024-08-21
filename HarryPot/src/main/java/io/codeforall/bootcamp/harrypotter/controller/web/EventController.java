package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.Event;
import io.codeforall.bootcamp.harrypotter.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for rendering {@link Event} related views
 */
@Controller
@RequestMapping("/event")
public class EventController {

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
     * Renders a view with a list of events
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listHouses(Model model) {
        model.addAttribute("events", eventService.list());
        return "event/list";
    }

    /**
     * Renders a view with event details
     *
     * @param id    the event id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showEvent(@PathVariable Integer id, Model model) throws Exception {


        //Event event = eventService.get(id);

        // command objects for character show view
        model.addAttribute("event", eventService.get(id));

        return "event/show";
    }

}
