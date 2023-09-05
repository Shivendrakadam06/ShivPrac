package com.day8;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestDemo {

	@Test
	public void test_demo() {
		System.out.println("this is first test case");
		String str1= "new test case";
		assertEquals("new test case",str1);
	}

}
