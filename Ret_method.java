import java.util.Scanner;

public class Ret_method {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();

		if (c == 1) {
			System.out.println(add(a, b));
		}

	}

	public static int add(int a, int b) {
		return (a + b);
	}

}
