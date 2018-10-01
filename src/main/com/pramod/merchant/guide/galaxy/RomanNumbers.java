package main.com.pramod.merchant.guide.galaxy;

public enum RomanNumbers {

	// initialize the roman number their values
	I (1),
	V (5),
	X (10),
	L (50),
	C (100),
	D (500),
	M (1000);

	private int romanNumberValue;


	// it will return the latest enum value that is passed
	public int getRomanNumberValue() {
		return this.romanNumberValue;
	}

	private  RomanNumbers(int romanNumberValue) {
		this.romanNumberValue = romanNumberValue;
	}


}

