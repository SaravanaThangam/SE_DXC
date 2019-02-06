package First;

import java.util.Scanner;

public class Ticket {
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		int n,sum=0,age,count,i;
		System.out.println("Enter n" );
		n=s.nextInt();
		System.out.println("Enter count" );
		count=s.nextInt();
		if((n>1)&&(n<5))
		{
			for(i=0;i<=count;i++)
			{
				age=s.nextInt();
			if(age<20)
			{
				sum=sum+100;
			}
			if((20<=age)&&(age<50))
			{
				sum=sum+200;
				
			}
			if((50<=age)&&(age<80))
			{
				sum=sum+300;
			}
			if(age>=80)
			{
			    sum=sum+0;
			}}
		}
		else
		{
System.exit(0);;
	}
	}
}
