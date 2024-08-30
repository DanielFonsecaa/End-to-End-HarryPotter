package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.Location;
import io.codeforall.bootcamp.harrypotter.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Location} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/location")
public class RestLocationController {

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
     * Retrieves a representation of the list of locations
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Location>> listLocation() {

        List<Location> location = locationService.list();

        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given location
     *
     * @param id the location id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Location> showLocation(@PathVariable Integer id) {

        Location location = locationService.get(id);

        if (location == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(location, HttpStatus.OK);
    }

}
