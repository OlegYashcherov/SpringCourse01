package com.olegyashcherov_spring_course_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Animal animal;
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }


//    public Person() {
//    }

//    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPetVoice() {
        animal.makeSound();
    }
}

