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
		
		int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = string.toUpperCase();
        /* operation to be performed on upper cases even if user 
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }return decimal;
	}
	
	
	 public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	        if (lastNumber > decimal) {
	            return lastDecimal - decimal;
	        } else {
	            return lastDecimal + decimal;
	        }
	    }
}
