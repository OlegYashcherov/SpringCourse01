package com.olegyashcherov_spring_course_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("snakeBean")
@Scope("prototype")
//@Component
public class Snake implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Sh-sh-sh");
    }
}
