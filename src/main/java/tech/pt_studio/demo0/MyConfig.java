package tech.pt_studio.demo0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
     @Bean
    Author author() {
        return new Author();
    }
}
