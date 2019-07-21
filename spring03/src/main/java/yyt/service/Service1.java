package yyt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyt.dao.Dao;

@Service
public class Service1 {
    @Autowired//注入dao
    private Dao dao;

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }


    public String getData() {
        return dao.getData();
    }


}
