import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		String c;
		
		System.out.println("Enter the first Number: ");
		
		a = s.nextInt();
		
		System.out.println("Enter the second Number: ");
		
		b = s.nextInt();
		
		System.out.println("Enter the operation: ");
		
		c = s.next();
		

		if (c == "+")
		{
			System.out.println("Result is " + add(a,b));    
		}
		else if (c == "-")
		{
			System.out.println("Result is " + sub(a,b));    
		}
		else if (c == "*")
		{
			System.out.println("Result is " + multiply(a,b)); 
			
		}
		else
		{
			System.out.println("Result is " + div(a,b));
			
		}
		
		s.close();
		
	}

	
	public static int add (int a, int b)
	{ 
		return (a+b);
		
	}
	public static int sub (int a, int b)
	{
		return (a-b);
		
	}
	
	public static int multiply (int a, int b)
	{
		return (a*b);
		
			
	}
	
	public static int div (int a, int b)
	{
		return (a/b);
	
	}
}



