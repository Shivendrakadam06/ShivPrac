package com.day8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	 Greeting greet;
	@Before
	public void setUp() throws Exception {
		greet= new Greeting();
	}

	@Test
	public void testGoodmorningMsg() {
		String str1="Good morning";
		assertEquals(greet.getGoodmorningMsg(),str1);
	}
	
	@Test
	public void testBirthdayMsg() {
		String str2="Happy Birthday";
		assertEquals(greet.getBirthdayMsg(), str2);
	}

		@Test
		public void testSame() {
		String	str1="abc";
		String			str2="abc";
			assertSame(str1, str2);
		}
}
