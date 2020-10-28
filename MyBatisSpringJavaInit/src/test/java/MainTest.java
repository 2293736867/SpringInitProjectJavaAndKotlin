import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.service.MyBatisService;

public class MainTest {
    @Test
    public void test()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBatisService service = (MyBatisService) context.getBean("myBatisService");
        service.test();
    }

}
