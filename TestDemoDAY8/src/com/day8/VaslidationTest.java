package com.day8;



import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VaslidationTest {
	static UserValidate uv;
	@BeforeClass
	public static void setUp() throws Exception {
		
		uv= new UserValidate();
	}

	@Test
	public void testvalidation() {
		assertTrue(uv.checkUSer("admin", "admin"));
	}

		@Test
		public void testShow() {
			System.out.println("another Test");
		}
		
	
		@After
		public void tearDown() {
			System.out.println("done testing");
		}
}
