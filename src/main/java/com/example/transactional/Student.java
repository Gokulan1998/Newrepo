package com.example.transactional;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Scope("singleton")
public class Student {
	private String name;
	private String name2;
//	public Student() {
//		System.out.println("This is student class");
//	}
	@Value("mani")
	public void setName(String name) {
		this.name=name;
	}
	@Value("gokul")
	public void setName2(String name) {
		this.name=name;
	}
	public String toString() {
		return "Name:"+name;
	}
}
