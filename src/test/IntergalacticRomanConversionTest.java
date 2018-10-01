package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.InputDataHandler;
import main.com.pramod.merchant.guide.galaxy.IntergalacticRomanConversion;

public class IntergalacticRomanConversionTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		InputDataHandler.tokenRomanValueMapping = null;

	}

	@Before
	public void setUp() throws Exception {
		InputDataHandler.tokenRomanValueMapping.put("glob", "I");
		InputDataHandler.tokenRomanValueMapping.put("prok", "V");
		InputDataHandler.tokenRomanValueMapping.put("pish", "X");
		InputDataHandler.tokenRomanValueMapping.put("tegj", "L");
		

	}

	

	@Test
	public void testProcessInput() {
		
		IntergalacticRomanConversion.processInput();
		assertTrue(InputDataHandler.tokenIntegerValue.size() == 4);
		assertEquals(InputDataHandler.tokenIntegerValue.get("glob"),1.0,0.0);


	}
	@Test
	public void testProcessInputNegative() {
		
		IntergalacticRomanConversion.processInput();
		assertFalse(InputDataHandler.tokenIntegerValue.size() == 5);
		assertNotEquals(InputDataHandler.tokenIntegerValue.get("glob"),2.0);


	}
	
	@Test
	public void testvalidateValueI() {
		assertTrue(IntergalacticRomanConversion.validateValue("I"));

	}
	@Test
	public void testvalidateValueV() {
		assertTrue(IntergalacticRomanConversion.validateValue("V"));

	}

	@Test
	public void testvalidateValueINeg()  {
		assertFalse(IntergalacticRomanConversion.validateValue("A"));

	}
	@Test
	public void testvalidateValuemissingInput() {
		InputDataHandler.missingValues.add("glob glob Silver is 34 Credits");
		InputDataHandler.missingValues.add("glob prok Gold is 57800 Credits");
		IntergalacticRomanConversion.missingInput();
		assertEquals(InputDataHandler.elementValueList.size(),2.0,0.0);


	}
	
	@Test
	public void testvalidateValuemissingInputNeg() throws IOException {
		IntergalacticRomanConversion.missingInput();
		assertEquals(InputDataHandler.elementValueList.size(),0.0,0.0);


	}

	
	

}
