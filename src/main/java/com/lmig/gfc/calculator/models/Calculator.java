package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Calculator {
	
	private double result;
	
	private ArrayList<String> history;
	
	public Calculator() {
		history = new ArrayList<String>();
	}
	
	public void add(double firstNumber, double secondNumber) {
		result = firstNumber + secondNumber;
		history.add(0, firstNumber + " + " + secondNumber + " = " + result);
	}
	
	public void subtract(double firstNumber, double secondNumber) {
		result = firstNumber - secondNumber;
		history.add(0, firstNumber + " - " + secondNumber + " = " + result);
	}
	
	public void multiply(double firstNumber, double secondNumber) {
		result = firstNumber * secondNumber;
		history.add(0, firstNumber + " * " + secondNumber + " = " + result);
	}
	
	public void divide(double firstNumber, double secondNumber) {
		result = firstNumber / secondNumber;
		history.add(0, firstNumber + " / " + secondNumber + " = " + result);
	}
	
	public void exponent(double firstNumber, double secondNumber) {
		result = Math.pow(firstNumber, secondNumber);
		history.add(0, firstNumber + " ^ " + secondNumber + " = " + result);
	}

	public double getResult() {
		return result;
	}

	public ArrayList<String> getHistory() {
		return history;
	}

}
