package io.codeforall.bootcamp.harrypotter.services;


import io.codeforall.bootcamp.harrypotter.persistence.model.Spell;

import java.util.List;

/**
 * Common interface for spell services, provides methods to manage spells
 */
public interface SpellService {

    /**
     * Gets the spell with the given id
     *
     * @param id the spell id
     * @return the spell
     */
    Spell get(Integer id);

    /**
     * Gets a list of the spells
     *
     * @return the spells list
     */
    List<Spell> list();

}
