import java.util.Scanner;

public class vendingmachine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, n, d,sum = 0,price=0;
		System.out.println("enter no of tickets");
		a = s.nextInt();

		if(a>=1 && a<=4)
		{
		for (n = 1; n <= a; n++) {
			System.out.println("age " + n);
			d = s.nextInt();
			price = (ticketprice(sum,d)) + price;
		}
		System.out.println("cost of tickets is"  +price);
		System.exit(0);
		s.close();
		}
}

	public static int ticketprice(int p,int b) {
		if (b >= 20 && b < 40) {
			p = 15;
			return (p);
		}
		if (b >= 40 && b < 60) {
			p = 25;
			return p;
		}
		if (b >= 60 && b <=100) {
			p = 35;
			return p;
		}
		return p;
	}
}