package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {



//    @Bean
//    public First first(@Qualifier("dp") Computer com)
//    {
//        First f = new First();
//        f.setAge(100);
//        f.setcom(com);
//        return f;
//    }
//        @Bean("dp")
//        //@Scope("prototype")
//
//
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }
//
//    @Bean
//    //@Primary
//    public Laptop laptop()
//    {
//        return new Laptop();
//    }
}


