import java.util.Scanner;

public class add {

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
		if(c==2) {
			System.out.println("Result is " + sub(a,b));
			}
		s.close();
			}
	public static int add(int a, int b) {
		return (a+b);
	}
	public static int sub(int a, int b) {
		return (a-b);
}
}



