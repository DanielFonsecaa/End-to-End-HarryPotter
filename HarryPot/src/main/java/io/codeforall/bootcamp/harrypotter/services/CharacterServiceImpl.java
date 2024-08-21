package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.CharacterDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    private CharacterDao characterDao;

    /**
     * Sets the character data access object
     *
     * @param characterDao the account DAO to set
     */
    @Autowired
    public void setCharacterDao(CharacterDao characterDao) {
        this.characterDao = characterDao;
    }

    /**
     * @see CharacterService#get(Integer)
     */
    @Override
    public Character get(Integer id) {
        return characterDao.findById(id);
    }


    /**
     * @see CharacterService#list()
     */
    @Override
    public List<Character> list() {
        return characterDao.findAll();
    }

}

