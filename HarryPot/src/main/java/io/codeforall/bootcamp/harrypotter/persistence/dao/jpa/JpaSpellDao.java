package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;


import io.codeforall.bootcamp.harrypotter.persistence.dao.SpellDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Spell;
import org.springframework.stereotype.Repository;

@Repository
public class JpaSpellDao extends GenericJpaDao<Spell> implements SpellDao {
    public JpaSpellDao() {
        super(Spell.class);
    }
}