package io.codeforall.bootcamp.harrypotter.services;

import io.codeforall.bootcamp.harrypotter.persistence.dao.HouseDao;
import io.codeforall.bootcamp.harrypotter.persistence.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    private HouseDao houseDao;

    /**
     * Sets the house data access object
     *
     * @param houseDao the account DAO to set
     */
    @Autowired
    public void setHouseDao(HouseDao houseDao) {
        this.houseDao = houseDao;
    }

    /**
     * @see HouseService#get(Integer)
     */
    @Override
    public House get(Integer id) {
        return houseDao.findById(id);
    }


    /**
     * @see HouseService#list()
     */
    @Override
    public List<House> list() {
        return houseDao.findAll();
    }

}

