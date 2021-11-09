package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanB;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {

    private BeanB beanB;

    public void setBeanB(BeanB beanB) {
        System.out.println(this.getClass().getSimpleName() + ". " + beanB.getClass().getSimpleName()
                + " was injected through the setter");
    }

}
