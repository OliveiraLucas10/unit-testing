package com.oliveira.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculationSum(new int[] { 1, 2, 3 });
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculationSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculationSum(new int[] {5});
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
