package com.dependencyinjection.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//makes a container in a JVM and a reference is stored in a context which contains the information about the Spring application container
		Dev obj=context.getBean(Dev.class);
		//In a obj object that class is accessed with the help of getbean method
		obj.build();
		//that referenced object is called
	}

}
