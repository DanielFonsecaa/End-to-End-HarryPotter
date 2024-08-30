package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.House;
import io.codeforall.bootcamp.harrypotter.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link House} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/house")
public class RestHouseController {

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
     * Retrieves a representation of the list of houses
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<House>> listHouse() {

        List<House> house = houseService.list();

        return new ResponseEntity<>(house, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given house
     *
     * @param id the house id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<House> showHouse(@PathVariable Integer id) {

        House house = houseService.get(id);

        if (house == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(house, HttpStatus.OK);
    }

}
