package com.spring.FirstSpringCore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext cont = new ClassPathXmlApplicationContext("bean.xml");
       /* Student s1=(Student) cont.getBean("student1");
        System.out.println("student code id" + s1.getStudentid());
        System.out.println("student name is "+ s1.getStudentname());
        
        
        Product p1=(Product) cont.getBean("product1");
        System.out.println("product id "+ p1.getProductid());
        System.out.println("product name"+ p1.getProductnane());
        System.out.println("product price"+ p1.getPrice());
        System.out.println("product quantity"+ p1.getQuantity());
        
        College c1 =(College) cont.getBean("college1");
        System.out.println("college id "+ c1.getClgid());
       List<Student> cj = c1.getSl();
       for(Student s:cj) {
    	   System.out.println(s.getStudentid());
    	   System.out.println(s.getStudentname());
    	   System.out.println(s.getScore());}*/
        Product p1=(Product) cont.getBean("product1");
        
    	   
       }
        
    }

