package io.codeforall.bootcamp.harrypotter.controller.web;

import io.codeforall.bootcamp.harrypotter.persistence.model.House;
import io.codeforall.bootcamp.harrypotter.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for rendering {@link House} related views
 */
@Controller
@RequestMapping("/house")
public class HouseController {

    private HouseService houseService;

    /**
     * Sets the house service
     *
     * @param houseService the house service to set
     */
    @Autowired
    public void setHouseService(HouseService houseService) {
        this.houseService = houseService;
    }


    /**
     * Renders a view with a list of houses
     *
     * @param model the model object
     * @return the view to render
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String listHouses(Model model) {
        model.addAttribute("houses", houseService.list());
        return "house/list";
    }

    /**
     * Renders a view with house details
     *
     * @param id    the house id
     * @param model the model object
     * @return the view to render
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showHouse(@PathVariable Integer id, Model model) throws Exception {


        //House house = houseService.get(id);

        // command objects for house show view
        model.addAttribute("house", houseService.get(id));

        return "house/show";
    }

}
