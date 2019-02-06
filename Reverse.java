import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the string to be reserved:");
		
		String a = s.nextLine();
		int b = a.length();
		System.out.println("Length of the string:"+b);
		
		String rev = "";
		
		for (int i = b;i>=0;i--)
		{
			rev = rev+ a.charAt(i);
		}
		
		System.out.println("Reversed String: "+rev);
		

	
	}

}
