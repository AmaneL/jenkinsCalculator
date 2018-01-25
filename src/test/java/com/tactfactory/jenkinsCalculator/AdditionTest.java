package com.tactfactory.jenkinsCalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	Addition add;
	
	@Before
	public void setUp() throws Exception {
		this.add = new Addition(1);
	}

	@After
	public void tearDown() throws Exception {
		this.add = null;
	}

	/**
	 * Test method for {@link com.tactfactory.Calculator.Addition#Addition(int)}.
	 */
	@Test
	public void testAddition() {
		Assert.assertNotNull(this.add);
	}

	/**
	 * Test method for {@link com.tactfactory.Calculator.Addition#make(int)}.
	 */
	@Test
	public void testMake() {
		this.add.make(2);
		Assert.assertNotNull(this.add);
		Assert.assertEquals(3, this.add.value);
	}

	/**
	 * Test method for {@link com.tactfactory.Calculator.Addition#getValue()}.
	 */
	@Test
	public void testGetValue() {
		Assert.assertNotNull(this.add);
		Assert.assertEquals(1, this.add.getValue());
	}

}
