package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.RomanCalculation;

public class RomanCalculationTest {


	@Test
	public void testI() {
		
       int result = RomanCalculation.getRomanNumberValue('I');
         assertEquals(1, result);
	}
	@Test
	public void testV() {
		
       int result = RomanCalculation.getRomanNumberValue('V');
         assertEquals(5, result);
	}
	@Test
	public void testX() {
		
       int result = RomanCalculation.getRomanNumberValue('X');
         assertEquals(10, result);
	}
	@Test
	public void testL() {
		
       int result = RomanCalculation.getRomanNumberValue('L');
         assertEquals(50, result);
	}
	@Test
	public void testC() {
		
       int result = RomanCalculation.getRomanNumberValue('C');
         assertEquals(100, result);
	}
	@Test
	public void testD() {
		
       int result = RomanCalculation.getRomanNumberValue('D');
         assertEquals(500, result);
	}
	@Test
	public void testMPositive() {
		
       int result = RomanCalculation.getRomanNumberValue('M');
         assertEquals(1000, result);
	}
	
	@Test
	public void testMNegative() {
		
       int result = RomanCalculation.getRomanNumberValue('m');
         assertNotEquals(1000, result);
	}
	
	@Test
	public void testromanToDecimal() {
		float result = RomanCalculation.romanToDecimal("IV");
		System.out.println(result);
        assertEquals(4, result,0.0);

	}
	@Test
	public void testprocessDecimal() {
		float result =	RomanCalculation.processDecimal(10,50,100);
        assertEquals(90.0, result,0.0);

	}
	@Test
	public void testprocessDecimalNeeg() {
		float result =	RomanCalculation.processDecimal(10,50,100);
        assertEquals(100.0, result,10.0);

	}

	

}
