package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;

@Import(PenConfigurationClass.class)
@Configuration
public class HelloConfigurationClass {
	
	@Bean(name = "hello")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love Python");
		return hello;
	}

}
