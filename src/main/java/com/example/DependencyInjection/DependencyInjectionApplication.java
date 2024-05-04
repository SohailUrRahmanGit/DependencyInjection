package com.example.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
		System.out.println("Dependency Injection demo");

		AnimalSpeak xyz =  applicationContext.getBean(AnimalSpeak.class);
		Animal animal = applicationContext.getBean(Animal.class);


		// Get the secondary bean (Dog) by its name
		Dog dog = applicationContext.getBean("dog", Dog.class);

		xyz.setAnimal(animal);
		xyz.makeAnimalSpeak();


	}

}
