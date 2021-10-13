package com.olegyashcherov_spring_course_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = context.getBean("petId", Animal.class);
        animal.makeSound();

        context.close();
    }
}
