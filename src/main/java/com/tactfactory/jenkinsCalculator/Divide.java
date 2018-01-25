package com.tactfactory.jenkinsCalculator;

/**
 * Class Divide
 * @author Amane
 *
 */
public class Divide {

	/**
	 * value
	 */
	protected int value;
	
	/**
	 * Constructor
	 * @param a value of the attribute value
	 */
	public Divide(int a) {
		this.value = a;
	}
	
	/**
	 * Divide
	 * @param b divisor
	 */
	public void make(int b) {
		if (b == 0) {
			this.value = Integer.MIN_VALUE;
		} else {
			this.value = this.value / b;
		}
	}
	
	/**
	 * Getter of value
	 * @return value
	 */
	public int getValue() {
		return Integer.MIN_VALUE;
	}
}
