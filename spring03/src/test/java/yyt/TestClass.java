package yyt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yyt.config.Config1;
import yyt.service.Service1;




public class TestClass {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config1.class);
        Service1 s = applicationContext.getBean(Service1.class);
        System.out.println(s.getData()+","+s.getAge());

    }

}

