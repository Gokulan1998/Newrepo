package com.example.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingcentreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrainingcentreApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student std1=context.getBean(Student.class);
		System.out.println(std1);
		std1.setName("prakash");
		System.out.println(std1);
		Student std2=context.getBean(Student.class);
		System.out.println(std2);
		
	}
	
}
