package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.play();



//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        First f = context.getBean(First.class);//GETBEANBYTYPE
//        f.run();
    }
}
