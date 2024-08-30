package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.Location;
import io.codeforall.bootcamp.harrypotter.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for rendering {@link Location} related views
 */
@Controller
@RequestMapping("/location")
public class LocationController {

    private LocationService locationService;

    /**
     * Sets the location service
     *
     * @param locationService the location service to set
     */
    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }


    /**
     * Renders a view with a list of locations
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listLocation(Model model) {
        model.addAttribute("locations", locationService.list());
        return "location/list";
    }

    /**
     * Renders a view with location details
     *
     * @param id    the location id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showLocation(@PathVariable Integer id, Model model) throws Exception {


        //Event event = eventService.get(id);

        // command objects for location show view
        model.addAttribute("location", locationService.get(id));

        return "location/show";
    }

}
