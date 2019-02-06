package basic;
import java.util.*;

class parent {
	public static int add(int a, int b) {
		return (a + b);
	}

	public static float sub(float a, float b) {
		return (a - b);
	}

	public static double multiply(double a, double b) {
		return (a * b);
	}

	public static long Divide(long a, long b) {
		return (a / b);
	}
}

public class Inherit extends parent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("Entered a value");
		a = s.nextInt();
		System.out.println("Entered b value");
		b = s.nextInt();
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(multiply(a,b));
		System.out.println(Divide(a,b));
	}

}
