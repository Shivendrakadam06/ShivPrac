package com.spring.third;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration



public class StudentConfig {

	@Bean(name="student1")
	public Student getStudent()
	{
		Student s1=new Student();
		s1.setStudentid(1);
		s1.setStudentname("Anshika");
		s1.setScore(90);
		return s1;
	}
	@Bean(name="student2")
	public Student getStudent2()
	{
		Student s=new Student();
		s.setStudentid(2);
		s.setStudentname("Naman");
		s.setScore(89);
		return s; 
	}
}
