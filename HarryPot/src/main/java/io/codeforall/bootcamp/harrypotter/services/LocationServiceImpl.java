package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.LocationDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationDao locationDao;

    /**
     * Sets the location data access object
     *
     * @param locationDao the account DAO to set
     */
    @Autowired
    public void setLocationDao(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    /**
     * @see LocationService#get(Integer)
     */
    @Override
    public Location get(Integer id) {
        return locationDao.findById(id);
    }


    /**
     * @see LocationService#list()
     */
    @Override
    public List<Location> list() {
        return locationDao.findAll();
    }

}

