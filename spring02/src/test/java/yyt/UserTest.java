package yyt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
    @Test
    public void testshow() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User u = (User) applicationContext.getBean("user");
        System.out.println(u.getName());
        u.show();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}

