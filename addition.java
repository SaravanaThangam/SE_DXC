package basic;
import java.util.*;

public class addition {
	public void p() {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("value a");
		a = s.nextInt();
		System.out.println("value b");
		b = s.nextInt();
		System.out.println("value c");
		c = s.nextInt();
		
		if (c == 4)
			System.out.println("value of div" + div(a, b));
		else if (c == 3)
			System.out.println("value of mul" + mul(a, b));
		else if (c == 2)
			System.out.println("value of sub" + sub(a, b));
		else if (c == 1)
			System.out.println("value of add" + add(a, b));
		else {
			System.out.println("choose number 1 to 4");
			c = s.nextInt();
//		System.out.println("value c");
		}
		s.close();
	}

	static int add(int a, int b) {
		return (a + b);
	}

	static int sub(int a, int b) {
		if (a > b) {
			return (a - b);
		}
		return (b - a);
	}

	static int mul(int a, int b) {
		return (a * b);
	}

	static int div(int a, int b) {
		if (a > b) {
			return (a % b);
		}
		return (b % a);
	}
}
