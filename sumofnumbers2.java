package basic;
import java.util.Scanner;

public class sumofnumbers2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a,b;

		System.out.println("Enter the number");
		a = s.nextInt();
		s.close();
		
	System.out.println(sumofnumb(a));     //whatever the number of digits are
	}

	public static int sumofnumb(int no) {
		int sum=0;
		for (; no != 0;) {
			sum = sum + (no % 10);
			no = no / 10;
		}
		
		if(sum>9) {
			sum=sumofnumb(sum);
		}
		
		return sum;
	}
} 