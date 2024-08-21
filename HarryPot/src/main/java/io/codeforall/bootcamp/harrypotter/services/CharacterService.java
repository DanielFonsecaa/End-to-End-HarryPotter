package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.Character;

import java.util.List;

/**
 * Common interface for character services, provides methods to manage characters
 */
public interface CharacterService {

    /**
     * Gets the character with the given id
     *
     * @param id the character id
     * @return the character
     */
    Character get(Integer id);

    /**
     * Gets a list of the characters
     *
     * @return the characters list
     */
    List<Character> list();

}
