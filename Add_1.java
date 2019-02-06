package basic;
import java.util.Scanner;

public class Add_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(add(a, b));
		s.close();
	}

	public static int add(int a, int b) {
		return (a + b);
	}
}