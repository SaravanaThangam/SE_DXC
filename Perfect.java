import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		int a = 0, sum = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a = s.nextInt();
		for (int i = 2; i <= (a / 2); i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == a) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a perfect number");
		}
		s.close();

	}

}
