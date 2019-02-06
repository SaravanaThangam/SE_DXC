package oops;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		factNumber(a);
		
	}
	
	public static void factNumber(int n)
	{
		int fact = 1;
		
		if(n==0)
			System.out.println("Factrorial of "+n+" is 1");
		
		else 
		{
			for(int i =n;i>0;i--)
			fact = fact *n;
			System.out.println("Factrorial of "+n+" is "+fact);

		}
	}
	

}
