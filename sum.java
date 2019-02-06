import java.util.*;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a, sum;
		sum = 0;
		a = s.nextInt();
		s.close();
		for (; a != 0;) {

			sum = sum + (a % 10);
			a = a / 10;
		}
		System.out.println(sum);
	}

}
