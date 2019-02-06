import java.util.Scanner;

public class Addition_of_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		a = s.nextLong();

		System.out.println(Loop(a));

		s.close();

	}

	public static long Loop(long a) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (; a != 0;) {
			sum = sum + (a % 10);
			a = a / 10;
		}

		if (sum > 9) {
			System.out.println(sum);
			sum=Loop(sum);
		}

		//else {}
				
			return sum;

	}

}
