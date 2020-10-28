import org.junit.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import pers.service.MyBatisService

class MainTest {
    @Test
    fun test()
    {
        val context: ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
        val service: MyBatisService = context.getBean("myBatisService") as MyBatisService
        service.test()
    }
}