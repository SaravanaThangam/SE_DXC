package basic;
import java.util.*;

public class Numbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		String c;
		System.out.println("Enter A value: ");
		a = s.nextInt();
		System.out.println("Enter B value : ");
		b = s.nextInt();
		System.out.println("Operation ? : ");
		c = s.next();
		if (c.equals("+")) {
			System.out.println("Result is " + add(a, b));
		} 
		else if (c.equals("-")) {
			System.out.println("Result is " + sub(a, b));
		} else if (c.equals("*")) {
			System.out.println("Result is " + multiply(a, b));
		} else {
			System.out.println("Result is " + Divide(a, b));
		}
		s.close();
	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static int sub(int a, int b) {
		return (a - b);
	}

	public static int multiply(int a, int b) {
		return (a * b);
	}

	public static int Divide(int a, int b) {
		return (a / b);
	}
}
