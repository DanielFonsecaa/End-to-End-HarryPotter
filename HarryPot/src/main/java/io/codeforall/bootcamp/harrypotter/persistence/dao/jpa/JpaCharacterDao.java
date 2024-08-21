package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;

import io.codeforall.bootcamp.harrypotter.persistence.dao.CharacterDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Character;
import org.springframework.stereotype.Repository;

@Repository
public class JpaCharacterDao extends GenericJpaDao<Character> implements CharacterDao {
    public JpaCharacterDao() {
        super(Character.class);
    }
}