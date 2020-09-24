package pers;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.bean.HelloWorld;

public class Tests {
    @Test
    void test()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((HelloWorld)context.getBean("helloWorld")).sayHelloWorld();
    }
}
