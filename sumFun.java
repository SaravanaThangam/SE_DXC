import java.util.Scanner;

public class sumFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b;
		s.close();
		System.out.println(sumfun(a));
		b =0+ sumfun(a);
		if (b > 10) {
			System.out.println(sumfun(b));
		}

	}

	public static int sumfun(int ai) {
		int sum = 0;
		for (; ai != 0;) {
			sum = sum + (ai % 10);
			ai = ai / 10;
		}
		// we can use that if condition here also
		return (sum);

	}
}
