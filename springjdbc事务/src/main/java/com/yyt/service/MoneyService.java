package com.yyt.service;

import com.yyt.dao.MoneyDao;
import com.yyt.entity.Money;

import java.util.List;

public class MoneyService {
    private MoneyDao moneyDao;

    public MoneyDao getMoneyDao() {
        return moneyDao;
    }

    public void setMoneyDao(MoneyDao moneyDao) {
        this.moneyDao = moneyDao;
    }
    public void shiwu() {
        String sql1 = "update user set money = money-1000 where id = 1";
        String sql2="update user set money = money+1000 where id = 2";


        moneyDao.update(sql1, null);
        int b = 1/0;
        moneyDao.update(sql2,null);


    }
}
