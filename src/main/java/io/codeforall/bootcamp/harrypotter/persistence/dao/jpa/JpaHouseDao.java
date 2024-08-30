package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;

import io.codeforall.bootcamp.harrypotter.persistence.dao.HouseDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.House;
import org.springframework.stereotype.Repository;

@Repository
public class JpaHouseDao extends GenericJpaDao<House> implements HouseDao {
    public JpaHouseDao() {
        super(House.class);
    }
}