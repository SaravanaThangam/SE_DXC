import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second number");
		b = s.nextInt();
		System.out.println("Operations? ");
		c = s.nextInt();
		if (c == 1) {
			System.out.println("sum = " + Add(a, b));
		}
		if (c == 2) {
			System.out.println("sub = " + Sub(a, b));
		}

		s.close();
	}

	public static int Sub(int a, int b) {
		// TODO Auto-generated method stub
		// System.out.println("Difference between " + a + " and " + b + " = " + (a -
		// b));
		return (a - b);
	}

	public static int Add(int a, int b) {
		// TODO Auto-generated method stub
		// System.out.println("Sum = " + (a + b));
		return (a + b);
	}
}
