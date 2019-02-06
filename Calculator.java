import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Add \n2.Sub \n3.Multiply \n4.Divide \nEnter your Choise : ");
		int a, b, c;
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		System.out.println("Enter a and b value :");
		a = s.nextInt();
		b = s.nextInt();
		s.close();
		if (c == 1) {
			System.out.println(add(a, b));
		}
		if (c == 2) {
			System.out.println(sub(a, b));
		}
		if (c == 3) {
			System.out.println(mul(a, b));
		}
		if (c == 4) {
			System.out.println(div(a, b));
		}

	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static int sub(int a, int b) {
		return (a - b);
	}

	public static int mul(int a, int b) {
		return (a * b);
	}

	public static int div(int a, int b) {
		return (a / b);
	}

}
