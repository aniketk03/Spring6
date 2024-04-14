package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean({"dp", "rp"})
    public Desktop desktop()
    {
        return new Desktop();
    }
}
