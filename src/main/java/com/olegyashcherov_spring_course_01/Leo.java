package com.olegyashcherov_spring_course_01;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("leoId")
public class Leo implements Animal{
    @Override
    public void makeSound() {
        System.out.println("R-r-r-r-R");
    }

    @PostConstruct
    public void init() {
        System.out.println("init " + this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy " + this);
    }
}
