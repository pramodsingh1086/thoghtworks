package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.RomanNumbers;

public class RomanNumbersTest {
	

	
	

	@Test
	public void testI() {
		int result = RomanNumbers.I.getRomanNumberValue();
		assertEquals(result,1);

	}
	@Test
	public void testV() {
		int result = RomanNumbers.V.getRomanNumberValue();
		assertEquals(result,5);

	}
	@Test
	public void testX() {
		int result = RomanNumbers.X.getRomanNumberValue();
		assertEquals(result,10);

	}
	@Test
	public void testC() {
		int result = RomanNumbers.C.getRomanNumberValue();
		assertEquals(result,100);

	}
	@Test
	public void testM() {
		int result = RomanNumbers.C.getRomanNumberValue();
		assertNotEquals(result,10);

	}

}
