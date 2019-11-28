package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.sun.javafx.collections.MappingChange.Map;

@Component("hello")
public class Hello {
	private String msg;
	
	public Map<String, Integer> map;
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Hello() {
		System.out.println("Hello object is created");
	}

	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method executing from Hello");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executing from Hello");
	}

}
