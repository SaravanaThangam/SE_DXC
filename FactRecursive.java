package oops;

import java.util.Scanner;

public class FactRecursive 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int fact =1;
		fact=factNumber(a);
		System.out.println("Factorial of "+a+" is "+fact);
		
	}
	
	public static boolean factNumber(int n)
	{
		boolean touched =false;
		int fact = 1;
		if (touched ==false)
		{
		if(n==0)
			
			return 1;
		}
		if(touched =true)
		{
			
		return (n*factNumber(n-1));
	}
		
	}

}
