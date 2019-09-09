package com.oliveira.unittesting.unittesting.business;

public class SomeBusinessImpl {

	public int calculationSum(int[] data) {
		int sum = 0;

		for (int value : data) {
			sum += value;
		}

		return sum;
	}

}
