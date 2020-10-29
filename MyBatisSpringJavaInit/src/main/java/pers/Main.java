package pers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.init.dao.UserDao;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = (UserDao) context.getBean("userDao");
        System.out.println(dao.selectById(1));
    }

}
