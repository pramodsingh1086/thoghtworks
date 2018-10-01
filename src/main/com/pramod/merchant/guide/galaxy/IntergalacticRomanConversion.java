package main.com.pramod.merchant.guide.galaxy;

import java.util.HashMap;
import java.util.Map;

public class IntergalacticRomanConversion {
	
	private static Map<String, Integer> decimalValue = new HashMap<String,Integer>();
	    public static final String NO_IDEA = "I have no idea what you are talking about";


//	public static Map<String, Integer> processInput(Map<String, String> inputreturned) {
//		
//		// TODO Auto-generated method stub
//		
//		//InputDataHandler.		
//		for(Map.Entry<String, String> data : inputreturned.entrySet()) {
//			
//			String key = data.getKey();
//			String romanValue = data.getValue();
//			
//			boolean valueValidator = validateValue(romanValue);
//			if(valueValidator) {
//				char convertedRoman = romanValue.charAt(0);
//				decimalValue.put(key, RomanCalculation.getRomanNumberValue(convertedRoman));
//
//			}else if(romanValue.contains("Credits")){
//				
//				String [] values = romanValue.split("Credits");
//				String ch = values[0];
//				
//				String valueToBeParsed = ch.replaceAll("\\s+","");
//
//				
//				int decialValueOfText = Integer.parseInt(valueToBeParsed);
//
//				
//				//char convertedRomanValues = values.get
//				 String[] keyData = key.split(" ");
//				 
//				 
//				 for(String getKeyFromMap :keyData) {
//					 
//					 if(decimalValue.containsKey(getKeyFromMap)) {
//						 
//						Integer value =  decimalValue.get(getKeyFromMap);
//						decialValueOfText = decialValueOfText - value;
//						
//						 
//					 }else {
//						 
//							decimalValue.put(getKeyFromMap, decialValueOfText);
//
//						 
//					 }
//					 
//				 }
//
//				
//
//			}else {
//				validateOutput(key,romanValue);
//			}
//
//		}
//		
//
//		return decimalValue;
//	}

//	private static void validateOutput(String key, String romanValue) {
//		StringBuilder keyOutput = new StringBuilder();
//		int result = 0;
//        
//       String str = romanValue.replaceAll("[?]*", "");
//
//		
//		if(romanValue!=NO_IDEA) {
//			String [] outputToBeDisplayed =  str.split(" ");
//			
//			
//			for(int i=0;i<outputToBeDisplayed.length;i++) {
//				 keyOutput.append(outputToBeDisplayed[i]);
//				 keyOutput.append(" ");
//
//
//				 if(decimalValue.containsKey(outputToBeDisplayed[0])) {
//					 if(i+1<outputToBeDisplayed.length) {
//						 Integer value =  decimalValue.get(outputToBeDisplayed[i]);
//						 Integer value1 =  decimalValue.get(outputToBeDisplayed[i+1]);
//						 if(value>=value1) {
//							 result = result +value;
//						 }else {
//							 result = result +value1 -value;
//							 i++;
//						 }
//						 
//					 }else
//				        { 
//						 result = result + decimalValue.get(outputToBeDisplayed[i]); 
//				            i++; 
//				        } 
//
//				 }
//				 
//			 }
//
//			 keyOutput.append("is");
//			 keyOutput.append(" ");
//			 keyOutput.append(result);
//			System.out.println(keyOutput);
//
//		}else {
//			System.out.println(NO_IDEA);
//		}
//		
//
//		
//	}

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
		float valueOfElementInDecimal = new RomanCalculation().romanToDecimal(stringBuilder.toString());
		InputDataHandler.elementValueList.put(element, creditValue/valueOfElementInDecimal);
		
	}


	

	
	

}
