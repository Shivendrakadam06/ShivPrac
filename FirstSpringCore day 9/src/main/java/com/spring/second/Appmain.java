package com.spring.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.FirstSpringCore.Product;
import com.spring.FirstSpringCore.Student;

public class Appmain {
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        ApplicationContext cont = new ClassPathXmlApplicationContext("beanconfig.xml");
	        Department d1=(Department) cont.getBean("department1");
	        System.out.println("dept code id" + d1.getDeptcode());
	        System.out.println("dept name is "+ d1.getDeptname());
	        Employee e=d1.getEobj();
	        System.out.println("emp id "+ e.getEmpid());
	        System.out.println("emp name "+ e.getEmpname());
	        System.out.println("emp salary "+ e.getSalary());
	        
	        Product p1=(Product) cont.getBean("product1");
	       
	      
	    }

}
