package com.olegyashcherov_spring_course_01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:App.properties")
public class Config_NoComponentScan {

    @Bean
    public PetOwner petOwner() {
        return new PetOwner(fishBean());
    }

    @Bean
    @Scope("prototype")
    public Animal fishBean() {
        return new Fish();
    }
}
