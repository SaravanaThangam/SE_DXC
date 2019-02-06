import java.util.Scanner;

public class Addition_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a, b=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		a = s.nextLong();
		do {
			b = Loop(a);
			a=b;
		} while (b > 9);

//		System.out.println(b);

		s.close();

	}

	public static long Loop(long a) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (; a != 0;) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		System.out.println(sum);
		return sum;

	}

}
