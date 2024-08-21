package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.SpellDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellServiceImpl implements SpellService {

    private SpellDao spellDao;

    /**
     * Sets the spell data access object
     *
     * @param spellDao the account DAO to set
     */
    @Autowired
    public void setSpellDao(SpellDao spellDao) {
        this.spellDao = spellDao;
    }

    /**
     * @see SpellService#get(Integer)
     */
    @Override
    public Spell get(Integer id) {
        return spellDao.findById(id);
    }


    /**
     * @see SpellService#list()
     */
    @Override
    public List<Spell> list() {
        return spellDao.findAll();
    }

}

