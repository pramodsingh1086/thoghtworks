package main.com.pramod.merchant.guide.galaxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class InputDataHandler {

	private static Map<String,String> romanNumberMappng = new LinkedHashMap<String,String>();
	
	public static final String NO_IDEA = "I have no idea what you are talking about";
	//MultiValueMap map = new MultiValueMap();
	public static Map<String, String> tokenRomanValueMapping = new HashMap<String, String>();
	public static Map<String, Float> tokenIntegerValue = new HashMap<String, Float>(); //{pish=10.0, tegj=50.0, prok=5.0, glob=1.0}
	public static Map<String, String> questionAndReply = new HashMap<String, String>();  //{how much is pish tegj glob glob ?, how many Credits is glob prok Iron ?}
	public static ArrayList<String> missingValues = new ArrayList<String>(); // [glob glob Silver is 34 Credits, glob prok Gold is 57800 Credits, pish pish Iron is 3910 Credits]
	public static Map<String, Float> elementValueList = new HashMap<String, Float>(); //{Gold=14450.0, Iron=195.5, Silver=17.0}



	public static Map<String, String> ProcessFile(String filePath) throws IOException {
		BufferedReader bufferedReader = null;
		if (filePath == null){
			InputStream in = InputDataHandler.class.getResourceAsStream("Input");
			bufferedReader = new BufferedReader(new InputStreamReader(in));
		}
		else{
			FileReader fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
		}
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			processInputData(line);

		}
		bufferedReader.close();


		return romanNumberMappng;

	}

	private static void processInputData(String line) {
		// String[] romanData = line.split(" ");
		
		String arr[] = line.split("((?<=:)|(?=:))|( )");

		if (line.endsWith("?")){
			questionAndReply.put(line,"");
		}
		else if (arr.length == 3 && arr[1].equalsIgnoreCase("is")){
			tokenRomanValueMapping.put(arr[0], arr[arr.length-1]);
		}
		else if(line.toLowerCase().endsWith("credits")){
			missingValues.add(line);
		}
	}



}
