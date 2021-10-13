package com.olegyashcherov_spring_course_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter04_Scope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Person person = context.getBean("personBean", Person.class);
//        person.getPetVoice();

//        System.out.println(person.getName());
//        System.out.println(person.getAge());

        Snake snake1 = context.getBean("snakeBean", Snake.class);
        Snake snake2 = context.getBean("snakeBean", Snake.class);

        System.out.println(snake1);
        System.out.println(snake2);

        context.close();
    }
}
