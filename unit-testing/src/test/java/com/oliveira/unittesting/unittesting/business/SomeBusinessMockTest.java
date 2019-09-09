package com.oliveira.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.oliveira.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessMockTest {

	SomeBusinessImpl business = new SomeBusinessImpl();
	SomeDataService dataServiceMock = mock(SomeDataService.class);

	@Test
	public void calculationSumUsingDataService_basic() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 1, 2, 3 });
		business.setSomeDataService(dataServiceMock);

		int actualResult = business.calculationSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSum_empty() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		business.setSomeDataService(dataServiceMock);

		int actualResult = business.calculationSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculationSumUsingDataService_oneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 5 });
		business.setSomeDataService(dataServiceMock);

		int actualResult = business.calculationSumUsingDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
