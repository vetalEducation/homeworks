package com.epam.spring.homework1.pet;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class Dog implements Animal {

    public String getAnimal() {
        return "Dog";
    }

}
