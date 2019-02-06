import java.util.*;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number of tickets:");
		
		int a = s.nextInt();
		int sum= 0;
		
		if (a<1 || a>4)
		{
			System.out.println("Please enter a value greater than 0 or less than 4");
		}
		
		else
		{
			for (int b=1; b<= a; b++)
			{
				System.out.println("Enter the age for person "+b);
				int c = s.nextInt();
				if (c>20 && c<=30 )
				{
					sum = sum +200;
				}
				if (c>30 && c<=40 )
				{
					sum = sum +300;
					
				}
				if (c>40 && c<=50 )
				{
					sum = sum +400;
				}
				if (c>50 || c<=20)
				{
					sum = sum +100;
				}
				
			}
		}
		System.out.println(sum);
	}

}
