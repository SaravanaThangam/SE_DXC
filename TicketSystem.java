package basic;
import java.util.*;

public class TicketSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, c, sum = 0;
		System.out.println("Welcome to Ticketing System");
		System.out.println("Please enter how many tickets you required");
		a = s.nextInt();
		
		if((a>1) && (a<=4))
		{
			for(int b=1;b<=a;b++) {
				System.out.println("Please enter Ages of the members");
				c=s.nextInt();
				if((c>20)&&(c<=30))
				{
					sum= sum + 200;
				}
				if((c>30)&&(c<=40))
				{
					sum=sum+300;
				}
				if((c>40)&&(c<=50))
				{
					sum=sum+400;
				}
				if((c>50)||(c<=20))
				{
					sum=sum+100;
				}
			}
		} else 
		System.exit(0);
		System.out.println("Overall amount to be paid: " + sum);
}
}
