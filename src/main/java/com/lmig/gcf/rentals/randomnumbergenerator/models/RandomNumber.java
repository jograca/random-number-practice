package com.lmig.gcf.rentals.randomnumbergenerator.models;

import java.util.Random;

public class RandomNumber {

	private int result;
	
	public void calculateRandomNumber(int max) {
		
		Random rn = new Random();
		result = rn.nextInt(max);
	}
	
	public int getResult() {
		return result;
	}
	
}
