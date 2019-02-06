package Second;

import java.util.Scanner;

public class fact2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n,f=1;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		fact = fact(n);
		if(n<0)
		{
			return 0;
		}
		else
		{
			System.out.println(fact(f));
		}
	}
		 static int fact(int fa)
	{
			 
			 if(n==0||n==1)
			 {
				 return 1;
			 }
			 else
			 {
				 return n*fa(n-1);
			 }
	}
	}
