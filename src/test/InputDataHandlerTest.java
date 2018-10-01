package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;

import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.InputDataHandler;

public class InputDataHandlerTest {

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessFilePositive() throws IOException {
		InputDataHandler.ProcessFile("/Users/pramodkumarsingh/eclipse-workspace/ThoughWorks/src/main/com/pramod/merchant/guide/galaxy/Input.txt");
		
		assertTrue(InputDataHandler.questionAndReply.size() == 5);

	}
	@Test
	public void testProcessFileNegative() throws IOException {
		InputDataHandler.ProcessFile("/Users/pramodkumarsingh/eclipse-workspace/ThoughWorks/src/main/com/pramod/merchant/guide/galaxy/Input.txt");
		
		assertFalse(InputDataHandler.questionAndReply.size() == 4);

	}
	
	
	
	
	
	
	

}
