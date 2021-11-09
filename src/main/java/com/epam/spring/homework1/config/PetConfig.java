package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan("com.epam.spring.homework1.pet")
@ComponentScan(includeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE, value = Spider.class))
public class PetConfig {

    @Bean
    public Animal dog() {
        return new Dog();
    }

    @Bean
    public Animal cat() {
        return new Cat();
    }

    @Bean
    public Animal cheetah() {
        return new Cheetah();
    }

    @Bean
    public Animal spider() {
        return new Spider();
    }

}
