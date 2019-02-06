package oops;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a num");
		Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    
	    
	    isPalindrome(n);
	}
	
	public static void isPalindrome(int a)
	
	{
		int b= a;
		int r =0;
		int sum =0;
		
		r = a %10;
		sum =sum + (r*10);
		a = a/10;
		
	if(b==r)
	{
		System.out.println("Palindrome");
		
	}
	
	else
	{
		System.out.println("Not Palindrome");
	}
	
}
}
