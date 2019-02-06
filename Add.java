import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a, b;

		System.out.println("Enter first value");
		a = s.nextInt();

		System.out.println("Enter second Value");
		b = s.nextInt();
		System.out.println("Sum1 = " + (a + b));
		s.close();

	}

}
