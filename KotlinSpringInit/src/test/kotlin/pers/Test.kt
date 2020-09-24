package pers

import org.junit.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import pers.bean.HelloWorld

class Test {
    @Test
    fun test()
    {
        val context:ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
        (context.getBean("helloWorld") as HelloWorld).sayHelloWorld()
    }
}