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
        First f = context.getBean(First.class);
        f.run();
        System.out.println(f.getAge());
//        Desktop dt = context.getBean("rp",Desktop.class);
//        dt.play();
//
//        Desktop dt1 = context.getBean("rp",Desktop.class);
//        dt1.play();



//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        First f = context.getBean(First.class);//GETBEANBYTYPE
//        f.run();
    }
}
