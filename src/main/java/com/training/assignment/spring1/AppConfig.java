package com.training.assignment.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("cat1")
	public Cat getCat() {
		Cat cat = new Cat("cuty","himalayan",3);
		return cat;
	}
	@Bean("dog1")
	public Dog getDog() {
		Dog dog = new Dog("tommy","labrador retriever",7);
		return dog;
	}
	@Bean("person1")
	public Person getPerson() {
		Person person = new Person("Aishu","female",22);
		return person;
	}
	@Bean("pet")
	public Animal getAnimal() {
		Animal animal = new Animal("red horse",4);
		return animal;
	}
}