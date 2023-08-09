package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.controler.studentcontroller;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private studentcontroller studentcontroller;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext();
		try {
			context.getBean(DemoApplication.class).run(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	@Override
	public void run(String... args) throws Exception {

		studentcontroller.registerNewproduct();

	}

}
