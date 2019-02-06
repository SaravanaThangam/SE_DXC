package Second;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);

		int i=1,factorial=1,n;
		System.out.println("Enter n");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Fact is = "+ factorial);
	}

}

