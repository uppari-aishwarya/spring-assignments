package com.training.assignment.spring1;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.assignment.spring1.Animal;

public class Person {
	private String name;
	private int age;
	@Autowired
	private Animal pet;
	
	public Person() {}
	public Person(String name,String gender,int age) {
		this.setName(name);
		
		this.setAge(age);
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
	public Animal getPet() {
		return pet;
		}
	public void setPet(Animal pet) {
		this.pet = pet;
		}
	
	public String getDetails() {
		return name+" is a "+age+" years old human and has a pet named "+pet.getName()+"\n"+pet.getDetails();
	}
	
}
