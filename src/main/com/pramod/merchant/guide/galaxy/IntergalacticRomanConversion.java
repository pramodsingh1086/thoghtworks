package main.com.pramod.merchant.guide.galaxy;

import java.util.Map;

public class IntergalacticRomanConversion {
	
	    public static final String NO_IDEA = "I have no idea what you are talking about";


	public static boolean validateValue(String romanValue) {
		// TODO Auto-generated method stub
		
		if(romanValue.equals("I")|romanValue.equals("V")|romanValue.equals("X")|romanValue.equals("L")|romanValue.equals("C")|romanValue.equals("D")|romanValue.equals("M"))
			return true;
		return false;
	}

	public static void processInput() {
		// TODO Auto-generated method stub
		for(Map.Entry<String, String> data : InputDataHandler.tokenRomanValueMapping.entrySet()) {
			String key = data.getKey();
			String romanValue = data.getValue();
			
			boolean valueValidator = validateValue(romanValue);
			if(valueValidator) {
				char convertedRoman = romanValue.charAt(0);
				InputDataHandler.tokenIntegerValue.put(key, (float) RomanCalculation.getRomanNumberValue(convertedRoman));
				

			}
			
		}

		
	}

	public static void missingInput() {
		// TODO Auto-generated method stub
		for (int i = 0; i < InputDataHandler.missingValues.size(); i++) {
			deCodeMissingQuery(InputDataHandler.missingValues.get(i));
		}
	}

	private static void deCodeMissingQuery(String query) {
		// TODO Auto-generated method stub
		
		String array[] = query.split("((?<=:)|(?=:))|( )");
		int splitIndex = 0;
		int creditValue = 0; String element= null; String[] valueofElement = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i].toLowerCase().equals("credits")){
				creditValue = Integer.parseInt(array[i-1]);
				
			}
			if(array[i].toLowerCase().equals("is")){
				splitIndex = i-1;
				element = array[i-1];
			}
			valueofElement = java.util.Arrays.copyOfRange(array, 0, splitIndex);
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int j = 0; j < valueofElement.length; j++) {
			stringBuilder.append(InputDataHandler.tokenRomanValueMapping.get(valueofElement[j]));
		}
		float valueOfElementInDecimal =  RomanCalculation.romanToDecimal(stringBuilder.toString());
		InputDataHandler.elementValueList.put(element, creditValue/valueOfElementInDecimal);
		
	}


	

	
	

}
