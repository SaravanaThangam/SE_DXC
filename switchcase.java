import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Add \n2.Sub \n3.Multiply \n4.Divide \nEnter your Choise : ");
		int a, b, c;
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		System.out.println("Enter a and b value :");
		a = s.nextInt();
		b = s.nextInt();
		s.close();
		switch(c) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
			default:
				System.out.println("you Entered incorrect choise");
		}
	}

}
