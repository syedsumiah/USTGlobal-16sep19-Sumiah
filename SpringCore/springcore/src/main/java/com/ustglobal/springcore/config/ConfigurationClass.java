package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class ConfigurationClass {
	
	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I hate Avipsa :(");
		return hello;
	}
	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
	return new Cat();	
	}
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Avipsa.....bla bla bal..");
		//pet.setAnimal(getDog());
		return pet;
	}

}
