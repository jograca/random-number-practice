package com.lmig.gcf.rentals.randomnumbergenerator.models;

import java.util.Random;

public class RandomNumber {

	private int result;
	
	public void calculateRandomNumber(int min, int max) {
		
		Random rn = new Random();
		result = rn.nextInt((max - min + 1) + min);
	}
	
	public void clearRandomNumber() {
		result = 0;
	}
	
	public int getResult() {
		return result;
	}
	
}
