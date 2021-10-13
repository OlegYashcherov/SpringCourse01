package com.olegyashcherov_spring_course_01;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Gav-Gav");
    }

    public void init() {
        System.out.println("init Dog");
    }

    public void destroy() {
        System.out.println("destroy Dog");
    }
}
