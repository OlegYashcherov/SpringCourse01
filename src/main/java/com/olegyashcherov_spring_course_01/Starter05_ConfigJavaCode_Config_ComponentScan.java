package com.olegyashcherov_spring_course_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter05_ConfigJavaCode_Config_ComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("personBean", Person.class);
        person.getPetVoice();

        context.close();

    }
}
