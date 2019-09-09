package com.oliveira.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.oliveira.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessMockTest {

	SomeBusinessImpl business = new SomeBusinessImpl();
	SomeDataService dataServiceMock = mock(SomeDataService.class);

	@Before
	public void before() {
		business.setSomeDataService(dataServiceMock);
	}

	@Test
	public void calculationSumUsingDataService_basic() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 1, 2, 3 });
		assertEquals(6, business.calculationSumUsingDataService());
	}

	@Test
	public void calculateSum_empty() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculationSumUsingDataService());
	}

	@Test
	public void calculationSumUsingDataService_oneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 5 });
		assertEquals(5, business.calculationSumUsingDataService());
	}

}
