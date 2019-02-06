import java.util.*;

public class Ticket {
	public static void main(String[] args)
	{
		int num,i=0;
		int age,sum=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number of Tickects");
		num=a.nextInt();
		a.close();
		
		if(num<1)
			{
			System.out.println("Please enter the valid number of tickets");
			//System.exit(0);
			}
		else if (num>4)
			System.out.println("Enter the number less than 4");
		else
		{
			for(i=1;i<=num;i++)
			{
				System.out.println("Please enter the age:");
				age=a.nextInt();
				if (age>10 && age<=20)
					sum=sum+100;
					//System.out.println("Cost of ticket is 100");
				else if (age>20 && age <=40)
					sum=sum+200;
					//System.out.println("cost of ticket is 200");
				else if (age>40 && age<=50)
	sum=sum+300;				
//					System.out.println("Cost of ticket is 300");
				else if (age<=10 || age>50)
					sum=sum+50;
					
			}
			System.out.println("sum="+sum);
				
		}
		}
	}


