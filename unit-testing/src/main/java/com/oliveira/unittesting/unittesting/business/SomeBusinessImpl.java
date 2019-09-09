package com.oliveira.unittesting.unittesting.business;

import com.oliveira.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

	SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculationSum(int[] data) {
		int sum = 0;

		for (int value : data) {
			sum += value;
		}

		return sum;
	}

	public int calculationSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retriveAllData();

		for (int value : data) {
			sum += value;
		}

		return sum;
	}

}
