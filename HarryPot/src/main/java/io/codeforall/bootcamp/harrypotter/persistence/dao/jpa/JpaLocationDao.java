package io.codeforall.bootcamp.harrypotter.persistence.dao.jpa;


import io.codeforall.bootcamp.harrypotter.persistence.dao.LocationDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Location;
import org.springframework.stereotype.Repository;

@Repository
public class JpaLocationDao extends GenericJpaDao<Location> implements LocationDao {
    public JpaLocationDao() {
        super(Location.class);
    }
}