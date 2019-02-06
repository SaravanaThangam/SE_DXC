import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a and b value");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println(a + b);
		s.close();

	}

}
