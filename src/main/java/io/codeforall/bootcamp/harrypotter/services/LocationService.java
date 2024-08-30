package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.Location;

import java.util.List;

/**
 * Common interface for location services, provides methods to manage locations
 */
public interface LocationService {

    /**
     * Gets the location with the given id
     *
     * @param id the location id
     * @return the location
     */
    Location get(Integer id);

    /**
     * Gets a list of the locations
     *
     * @return the locations list
     */
    List<Location> list();

}
