package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.com.pramod.merchant.guide.galaxy.InputDataHandler;
import main.com.pramod.merchant.guide.galaxy.OutPutHandler;

public class OutPutHandlerTest {

	
	@Before
	public void setUp() throws Exception {
		InputDataHandler.questionAndReply.put("glob", "I");
		InputDataHandler.tokenRomanValueMapping.put("how much is pish tegj glob glob ?", "");
		InputDataHandler.tokenRomanValueMapping.put("how many Credits is glob prok Iron ?", "");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		OutPutHandler.processOutPut();
	}

}
