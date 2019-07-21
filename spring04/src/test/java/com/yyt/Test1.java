package com.yyt;

import com.yyt.service.Service1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service1 s = (Service1) applicationContext.getBean("dosomeservice");
        s.dosomeService();
    }
}
