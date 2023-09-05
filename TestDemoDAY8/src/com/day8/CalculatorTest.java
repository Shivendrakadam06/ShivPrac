package com.day8;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
Calculator calc;
	@Before
	public void setUp() throws Exception {
		calc= new Calculator();
	}

	@Test
	public void testAddition() {
		assertEquals(calc.add(10.0, 20.0), 30.0);
		
	}

}
