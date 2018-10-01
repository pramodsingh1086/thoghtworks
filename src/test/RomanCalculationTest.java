package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.RomanCalculation;

public class RomanCalculationTest {


	@Test
	public void testI() {
		
       int result = RomanCalculation.getRomanNumberValue('I');
         assertEquals(1, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testV() {
		
       int result = RomanCalculation.getRomanNumberValue('V');
         assertEquals(5, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testX() {
		
       int result = RomanCalculation.getRomanNumberValue('X');
         assertEquals(10, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testL() {
		
       int result = RomanCalculation.getRomanNumberValue('L');
         assertEquals(50, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testC() {
		
       int result = RomanCalculation.getRomanNumberValue('C');
         assertEquals(100, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testD() {
		
       int result = RomanCalculation.getRomanNumberValue('D');
         assertEquals(500, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testMPositive() {
		
       int result = RomanCalculation.getRomanNumberValue('M');
         assertEquals(1000, result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMNegative() {
		
       int result = RomanCalculation.getRomanNumberValue('m');
         assertNotEquals(1000, result);
		//fail("Not yet implemented");
	}

}
