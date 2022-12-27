package com.example;

import com.example.autowiring.EventDetails;
import com.example.setter.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.EventListener;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	//Autowired
	//ApplicationContext context;
	@Autowired
	Employee employee;
	@Autowired
	EventDetails eventDetails;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Employee = "+employee);
		eventDetails.printEvent("cricket").forEach(System.out::println);
	}
}
