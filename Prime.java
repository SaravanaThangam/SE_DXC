package oops;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a num");
		Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    isPrime(n);
	}
	
	public static void isPrime(int n)
	
	{
		int i,j=0;
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				j++;
		}
		
		if(j==2)
			 System.out.println(+n+" Is a Prime number");
			
		
		else 
			 System.out.println(+n+" Is Not a Prime number");
		
	}

}
