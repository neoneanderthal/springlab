package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		
		Door door = context.getBean("doorVisualAlarm", Door.class);
		
		door.open();
		door.close();
	}

}
