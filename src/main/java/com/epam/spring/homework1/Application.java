package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeansConfig.class);
        applicationContext.getBean(Pet.class).printPets();
        System.out.println(applicationContext.getBeansOfType(Cheetah.class));
        System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(Cheetah.class)));
    }

}
