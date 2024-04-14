package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

        @Bean({"dp", "rp"})
        @Scope("prototype")
    public Desktop desktop()
    {
        return new Desktop();
    }
}
