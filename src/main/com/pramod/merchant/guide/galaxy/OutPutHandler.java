package main.com.pramod.merchant.guide.galaxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutPutHandler {

	public static void processOutPut() {
		// TODO Auto-generated method stub
		
		Map<String, String> map = InputDataHandler.questionAndReply;
		for (Map.Entry<String, String> entry : map.entrySet()) {
			processReply(entry.getKey());
		}
		
	}

	private static void processReply(String key) {
		// TODO Auto-generated method stub
		

			if (key.toLowerCase().startsWith("how much")){
				findValueOfRoman(key);
			}
			else if (key.toLowerCase().startsWith("how many")){
				findValueOfElement(key);
			}

		
	}

	private static void findValueOfElement(String key) {
		// TODO Auto-generated method stub
		if (isValidinput(key)== true){
			ArrayList<String> tokenValueToRoman = new ArrayList<String>();
			ArrayList<String> tokenValue = splitQuery(key);
			for (int i = 0; i < tokenValue.size(); i++) {
				
				if(InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i))!=null) {
					String value = InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i));
					if(IntergalacticRomanConversion.validateValue(value)) {
						tokenValueToRoman.add(InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i)));

					}

				}
			}
			float value = new RomanCalculation().romanToDecimal(tokenValueToRoman.toString());
			tokenValue.add("is");tokenValue.add(Float.toString(value));
			System.out.println(outputFormatter(tokenValue));
		}
		else{
			System.err.println("I have no idea what you are talking about");
		}
	}

	private static String outputFormatter(ArrayList<String> tokenValue) {
		// TODO Auto-generated method stub
		return tokenValue.toString().replace(",", "").replace("[", "").replace("]", "");
	}

	private static ArrayList<String> splitQuery(String key) {
		// TODO Auto-generated method stub
		ArrayList<String> queryArray = new ArrayList<String>(Arrays.asList(key.split("((?<=:)|(?=:))|( )")));
		int startIndex = 0, endIndex = 0;
		for (int i = 0; i < queryArray.size(); i++) {
			if(queryArray.get(i).toLowerCase().equals("is")){
				startIndex = i+1;
			}
			else if(queryArray.get(i).toLowerCase().equals("?")){
				endIndex = i;

			}
		}
		String[] array = queryArray.toArray(new String[queryArray.size()]);
		return new ArrayList<String>(Arrays.asList(java.util.Arrays.copyOfRange(array, startIndex, endIndex)));

	}	

	private static boolean isValidinput(String key) {
		// TODO Auto-generated method stub
		Pattern regex = Pattern.compile("[$&+,:;=@#|]");
		Matcher matcher = regex.matcher(key);
		if (matcher.find()){
			return false;
		}
		else{
			return true;
		}	}

	private static void findValueOfRoman(String key) {
		// TODO Auto-generated method stub
		if (isValidinput(key)== true){
			ArrayList<String> tokenValueToRoman = new ArrayList<String>();
			ArrayList<String> tokenValue = splitQuery(key);
			for (int i = 0; i < tokenValue.size(); i++) {
				if(InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i))!=null) {
					String value = InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i));
					if(IntergalacticRomanConversion.validateValue(value)) {
						tokenValueToRoman.add(InputDataHandler.tokenRomanValueMapping.get(tokenValue.get(i)));

					}

				}
			}
			float value = new RomanCalculation().romanToDecimal(tokenValueToRoman.toString());
			tokenValue.add("is");tokenValue.add(Float.toString(value));
			System.out.println(outputFormatter(tokenValue));
		}
		else{
			System.err.println("I have no idea what you are talking about");
		}
	}

}
