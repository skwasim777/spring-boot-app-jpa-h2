package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.Repository.TutorialRepository")
public class SpringBootAppJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppJpaH2Application.class, args);
	}

}
