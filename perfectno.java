package basic;

import java.util.Scanner;

public class perfectno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,sum=0;
		System.out.println("enter a");
		a = s.nextInt();
			for(int i=a ; i>1 ; --i)
			{
				
			if(a%i==0)
			{
				sum = sum + (a/i);
			}
//			else
//			{
//				System.out.println("i");
//			}
//			
			}
			System.out.println("the sum of positive divisors is: "  +sum);
			if(sum == a)
			{
				System.out.println("the given number is perfect number");
				
			}
			else
			{
				System.out.println("the given number is not a perfect number");
			}
			s.close();
		}
		

	}

