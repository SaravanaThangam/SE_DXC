import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String testString, reverseString = "";
		System.out.println("Enter a String:");
		testString = s.next();
		System.out.println(testString.length());
		s.close();
		for (int i = testString.length(); i > 0; i--) {
			reverseString = reverseString + testString.charAt(i);
		}
		System.out.println("Reverse of given string is :" + reverseString);

	}

}
