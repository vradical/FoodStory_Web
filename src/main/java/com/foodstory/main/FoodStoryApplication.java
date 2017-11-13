package com.foodstory.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.foodstory.controllers")
@EntityScan("com.foodstory.domains")
@EnableJpaRepositories("com.foodstory.repositories")
@SpringBootApplication
public class FoodStoryApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FoodStoryApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(FoodStoryApplication.class, args);
	}
}
