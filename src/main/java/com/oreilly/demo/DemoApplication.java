package com.oreilly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(DemoApplication.class, args);
		System.out.println("ddddddd"+configurableApplicationContext.getEnvironment());
	}

}
