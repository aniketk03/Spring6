package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); //here we created the container and gave the location of xml
        First f = (First) context.getBean("first");//first is a id metioned in xml and it is typecasted
        f.run();
    }
}
