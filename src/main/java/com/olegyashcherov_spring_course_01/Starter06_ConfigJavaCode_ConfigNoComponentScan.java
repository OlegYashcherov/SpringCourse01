package com.olegyashcherov_spring_course_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter06_ConfigJavaCode_ConfigNoComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config_NoComponentScan.class);

//        Animal fish = context.getBean("fishBean", Animal.class);
//        fish.makeSound();

        PetOwner petOwner = context.getBean("petOwner", PetOwner.class);
        petOwner.getPetVoice();

        System.out.println(petOwner.getName());
        System.out.println(petOwner.getAge());

        context.close();

    }
}
