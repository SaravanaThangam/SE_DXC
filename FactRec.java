package oops;

import java.util.Scanner;

public class FactRec 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int fact =1;
		fact=factNumber(a);
		System.out.println("Factorial of "+a+" is "+fact);
		
	}
	
	public static int factNumber(int n)
	{
		//if boolean touched =false;
		if(n==0)
			return 1;
		
		else
		{
			//touched =true;
		return(n*factNumber(n-1));
	}
	}


}
