package main.com.pramod.merchant.guide.galaxy;

public class RomanCalculation {
	
	public static int getRomanNumberValue(char romanChar) {
		int value = 0;
		switch(romanChar)
		{
		case  'I': value = RomanNumbers.I.getRomanNumberValue();
		break;
		case  'V': value = RomanNumbers.V.getRomanNumberValue();
		break;
		case  'X': value = RomanNumbers.X.getRomanNumberValue();
		break;
		case  'L': value = RomanNumbers.L.getRomanNumberValue();
		break;
		case  'C': value = RomanNumbers.C.getRomanNumberValue();
		break;
		case  'D': value = RomanNumbers.D.getRomanNumberValue();
		break;
		case  'M': value = RomanNumbers.M.getRomanNumberValue();
		break;
		
		
		
		}
				
		return value;
		
	}

	public static float romanToDecimal(String string) {
		// TODO Auto-generated method stub
		//return 0;
		
		 float res = 0; 
		  
		    // Traverse given input 
		    for (int i=0; i<string.length(); i++) 
		    { 
		        // Getting value of symbol s[i] 
		        float s1 = getRomanNumberValue(string.charAt(i)); 
		  
		        if (i+1 < string.length()) 
		        { 
		            // Getting value of symbol s[i+1] 
			        float s2 = getRomanNumberValue(string.charAt(i+1)); 

		            // Comparing both values 
		            if (s1 >= s2) 
		            { 
		                // Value of current symbol is greater 
		                // or equal to the next symbol 
		                res = res + s1; 
		            } 
		            else
		            { 
		                res = res + s2 - s1; 
		                i++; // Value of current symbol is 
		                     // less than the next symbol 
		            } 
		        } 
		        else
		        { 
		            res = res + s1; 
		            i++; 
		        } 
		    } 
		    return res; 
	}
	

}
