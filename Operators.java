import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second number");
		b = s.nextInt();
		System.out.println(
				" select operations from menu\n 1.Addition\n 2.Subtraction\n 3.Division\n 4.Multiplication\n 5.Exit");
		c = s.nextInt();
		if (c > 5)
			System.out.println("Invalid choice");

		else {
			switch (c) {
			case 1:
				Add(a, b);
				break;
			case 2:
				Sub(a, b);
				break;
			case 3:
				Div(a, b);
				break;
			case 4:
				Mul(a, b);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Something went wrong!");

			}
			s.close();
		}
	}

	public static void Mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a +" multiplied by"+b+" = "+(a*b));
	}

	public static void Div(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0)
			System.out.println("Can't divide by zero");
		else
			System.out.println(a + " Divided by " + b + " = " + (a / b));
	}

	public static void Sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Difference between " + a + " and " + b + " = " + (a - b));
	}

	public static void Add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sum = " + (a + b));
	}
}
