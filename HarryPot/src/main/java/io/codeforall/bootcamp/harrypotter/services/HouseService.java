package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.House;

import java.util.List;

/**
 * Common interface for House services, provides methods to manage Houses
 */
public interface HouseService {

    /**
     * Gets the book with the given id
     *
     * @param id the House id
     * @return the House
     */
    House get(Integer id);

    /**
     * Gets a list of the Houses
     *
     * @return the Houses list
     */
    List<House> list();

}
