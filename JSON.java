package oops;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(s);
			JSONArray array = (JSONArray) obj;
			System.out.println(array);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception");
		}
	}

}
