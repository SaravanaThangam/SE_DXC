package oops;
import java.util.*;
public class Fibonacci
{
	public static void fibo(int n)
	{
		int a=0, b=1, c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++) 
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("How many fibonacci numbers you need :");
		n=s.nextInt();
		fibo(n);
		s.close();
	}
}

