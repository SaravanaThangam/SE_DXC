import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int a,b ,c;
		System.out.println("Enter a value");
		a= s.nextInt();
		System.out.println("Enter b value");
		b= s.nextInt();
		System.out.println("Operation ? " );
		c= s.nextInt();
		if(c==1) {
		System.out.println("Result is " + add(a,b));
		}
		
		s.close();
		

	}
	public static int add(int a, int b) {
		return (a+b);
	}
}

