package com.spring.third;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s1=(Student)cont.getBean("student2");
		System.out.println("Student name is "+s1.getStudentname());

	}

}
