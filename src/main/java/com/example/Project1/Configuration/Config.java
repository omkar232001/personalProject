package com.example.Project1.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
   public ModelMapper convertor(){
        return new ModelMapper();
    }
}
