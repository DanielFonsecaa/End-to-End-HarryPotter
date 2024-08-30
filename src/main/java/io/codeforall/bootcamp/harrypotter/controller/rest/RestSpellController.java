package io.codeforall.bootcamp.harrypotter.controller.rest;

import io.codeforall.bootcamp.harrypotter.persistence.model.Spell;
import io.codeforall.bootcamp.harrypotter.services.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Spell} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/spell")
public class RestSpellController {

    private SpellService spellService;

    /**
     * Sets the spell service
     *
     * @param spellService the spell service to set
     */
    @Autowired
    public void setSpellService(SpellService spellService) {
        this.spellService = spellService;
    }

    /**
     * Retrieves a representation of the list of spells
     *
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Spell>> listSpell() {

        List<Spell> spell = spellService.list();

        return new ResponseEntity<>(spell, HttpStatus.OK);
    }

    /**
     * Retrieves a representation of the given spell
     *
     * @param id the spell id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Spell> showSpell(@PathVariable Integer id) {

        Spell spell = spellService.get(id);

        if (spell == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(spell, HttpStatus.OK);
    }

}
