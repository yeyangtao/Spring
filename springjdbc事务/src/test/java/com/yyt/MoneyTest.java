package com.yyt;

import com.yyt.service.MoneyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoneyTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyService moneyService = (MoneyService)applicationContext.getBean("moneyService");
        moneyService.shiwu();
    }
}
