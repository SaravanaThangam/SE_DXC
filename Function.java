import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first value");
		a = s.nextInt();

		System.out.println("Enter second Value");
		b = s.nextInt();

		add(a, b);
		s.close();

	}

	public static void add(int a, int b) {

		System.out.println("Sum = " + (a + b));

	}

}
