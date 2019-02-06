import java.util.Scanner;

public class Addition_of_number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a, b=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		a = s.nextLong();
		Loop(a);
//		System.out.println(b);

		s.close();

	}

	public static void Loop(long a) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (; a != 0;) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		if(sum>9) {
			System.out.println(sum);
			Loop(sum);
			
		}
		else {
			System.out.println(sum);
		}
//		return sum;

	}

}
