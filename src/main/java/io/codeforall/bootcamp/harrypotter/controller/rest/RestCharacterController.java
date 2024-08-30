package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.Character;
import io.codeforall.bootcamp.harrypotter.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Character} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/character")
public class RestCharacterController {

    private CharacterService characterService;

    /**
     * Sets the character service
     *
     * @param characterService the character service to set
     */
    @Autowired
    public void setCharacterService(CharacterService characterService) {
        this.characterService = characterService;
    }

    /**
     * Retrieves a representation of the list of characters
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Character>> listCharacters() {

        List<Character> character = characterService.list();

        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given character
     *
     * @param id the character id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Character> showCharacter(@PathVariable Integer id) {

        Character character = characterService.get(id);

        if (character == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(character, HttpStatus.OK);
    }

}
