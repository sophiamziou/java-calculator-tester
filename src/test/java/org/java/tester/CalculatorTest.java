package org.java.tester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	
	private Calculator c;
	
	@BeforeEach
	void init() {
		float num1 = 5;
		float num2 = 3;
		c = new Calculator(num1, num2);
	}
	
	@RepeatedTest(10)
	public void getAddTest() throws Exception {
		
		assumeTrue(c.getNum2() != 0);
		
		final float attRes = c.getNum1() / c.getNum2();
		
		final float res = c.add(c.getNum1(), c.getNum2());
		
		assertEquals(attRes, res, "Somma tra float");
	}
	
	@RepeatedTest(10)
	public void getAddExcTest() {
		
		assumeTrue(c.getNum2() == 0);
		
		assertThrows(Exception.class,
				() -> c.add(c.getNum1(), c.getNum2()),
				"Deve sollevare eccezione");
	}
	
	@RepeatedTest(10)
	public void getSubTest() throws Exception {
		
		assumeTrue(c.getNum2() != 0);
		
		final float attRes = c.getNum1() / c.getNum2();
		
		final float res = c.subtract(c.getNum1(), c.getNum2());
		
		assertEquals(attRes, res, "Sottrazione tra float");
	}
	
	@RepeatedTest(10)
	public void getSubExcTest() {
		
		assumeTrue(c.getNum2() == 0);
		
		assertThrows(Exception.class,
				() -> c.subtract(c.getNum1(), c.getNum2()),
				"Deve sollevare eccezione");
	}
	
	
	@RepeatedTest(10)
	public void getDivTest() throws Exception {
		
		assumeTrue(c.getNum2() != 0);
		
		final float attRes = c.getNum1() / c.getNum2();
		
		final float res = c.divide(c.getNum1(), c.getNum2());
		
		assertEquals(attRes, res, "Divisione tra float");
	}
	
	@RepeatedTest(10)
	public void getDivExcTest() {
		
		assumeTrue(c.getNum2() == 0);
		
		assertThrows(Exception.class,
				() -> c.divide(c.getNum1(), c.getNum2()),
				"Deve sollevare eccezione");
	}
	
	@RepeatedTest(10)
	public void getMulTest() throws Exception {
		
		assumeTrue(c.getNum2() != 0);
		
		final float attRes = c.getNum1() / c.getNum2();
		
		final float res = c.multiply(c.getNum1(), c.getNum2());
		
		assertEquals(attRes, res, "Moltiplicazione tra float");
	}
	
	@RepeatedTest(10)
	public void getDMulExcTest() {
		
		assumeTrue(c.getNum2() == 0);
		
		assertThrows(Exception.class,
				() -> c.multiply(c.getNum1(), c.getNum2()),
				"Deve sollevare eccezione");
	}
	
}
