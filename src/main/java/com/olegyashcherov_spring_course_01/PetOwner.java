package com.olegyashcherov_spring_course_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PetOwner {

    private Animal animal;
    @Value("${owner.name}")
    private String name;
    @Value("${owner.age}")
    private int age;

    public PetOwner(Animal animal) {
        this.animal = animal;
    }

    public PetOwner() {
    }

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

    @PostConstruct
    public void init() {
        System.out.println("init " + this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy " + this);
    }
}

