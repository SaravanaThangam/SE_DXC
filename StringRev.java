package oops;

import java.util.Scanner;

public class StringRev 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = "Mamatha";
		System.out.println("Enter a String");
		int i =1;
		
		for(i=s.charAt(i-1);i>0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
	}

}
