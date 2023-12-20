package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStusent {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		
		Student student1=(Student)context.getBean("student");
		System.out.println(student1);
		
		Student student2=(Student)context.getBean("student");
		System.out.println(student2);
	}
}
