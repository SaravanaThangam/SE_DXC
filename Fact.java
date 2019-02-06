import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		
		Scanner s = new Scanner (System.in);
		
		int a = s.nextInt();
		int facto =1;
		
		if (a == 0)
			System.out.println("Factorial of number is: 1");
		else
		{
		for (int i = 1; i<=a;i++)
		{
			facto = facto*i;
			
		}
		System.out.println("Factorial of number is: "+facto);
		}
		
		
	
	}

}
