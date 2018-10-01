package main.com.pramod.merchant.guide.galaxy;

import java.io.IOException;

public class MerchantGuideToGalaxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputDataHandler.ProcessFile("/Users/pramodkumarsingh/eclipse-workspace/ThoughWorks/src/main/com/pramod/merchant/guide/galaxy/Input.txt");
			IntergalacticRomanConversion.processInput();
			IntergalacticRomanConversion.missingInput();
			OutPutHandler.processOutPut();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
