package com.example.mystarter.configuration;

import com.example.mystarter.handler.ErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    public ErrorHandler getErrorHandler() {
        return new ErrorHandler();
    }
}
