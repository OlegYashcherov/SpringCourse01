package com.olegyashcherov_spring_course_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter03_Annotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Snake snake = context.getBean("snakeBean", Snake.class);
//        Snake snake = context.getBean("snake", Snake.class);
//        snake.makeSound();

        Person person = context.getBean("personBean", Person.class);
        person.getPetVoice();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
