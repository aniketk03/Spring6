package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {



    @Bean
    public First first(Computer com)
    {
        First f = new First();
        f.setAge(100);
        f.setcom(com);
        return f;
    }
        @Bean("dp")
        //@Scope("prototype")


    public Desktop desktop()
    {
        return new Desktop();
    }
}
