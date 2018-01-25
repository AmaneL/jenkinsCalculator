package com.tactfactory.jenkinsCalculator;

/**
 * Class Addition
 * @author Amane
 *
 */
public class Addition {

	//value
	protected int value = 0;
	
	/**
	 * Constructor
	 * @param a value of the attribute value
	 */
	public Addition(int a) {
		this.value = a;
	}
	
	/**
	 * Addition
	 * @param b number to add
	 */
	public void make(int b) {
		this.value += b;
	}
	
	/**
	 * Getter of value
	 * @return value
	 */
	public int getValue() {
		return this.value;
	}
}
