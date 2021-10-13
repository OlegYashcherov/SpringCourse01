package com.olegyashcherov_spring_course_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter02 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.getPetVoice();

        System.out.println(person.getName() + ": " + person.getAge());

        context.close();
    }

}
