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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); //here we created the container and gave the location of xml [and object created on this line]
        First f = (First) context.getBean("first");//first is a id metioned in xml and it is typecasted
        f.a=10;
        System.out.println(f.a);

        First f1 = (First) context.getBean("first");//first is a id metioned in xml and it is typecasted
        System.out.println(f1.a);
        //here the default scope is singletone bydefault a value should be 0 but due  to scope it refer to one object
    }
}
