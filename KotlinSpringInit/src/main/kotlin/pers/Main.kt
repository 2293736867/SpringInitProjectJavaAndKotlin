package pers

import pers.bean.HelloWorld
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main()
{
    val context:ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
    (context.getBean("helloWorld") as HelloWorld).sayHelloWorld()
}