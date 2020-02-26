package com.epam.LoggingTask;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IntrestCalculationTest {
	IntrestCalculation ic;
	@Before
	public void init() {
		ic=new IntrestCalculation();
	}

	@Test
	public void simpleIntrestTest() {
	assertEquals(450.00,ic.simpleIntrest(3000, 5, 3),0);
	}
	@Test
	public void compoundIntrestTest() {
		assertEquals(6050.000000000001,ic.compoundIntrest(5000, 10, 2),0);
	}

	}
