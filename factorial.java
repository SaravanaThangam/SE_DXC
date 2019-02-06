package oops;
//import java.util
import java.util.Scanner;

class fact { 
	boolean touched = false;
	public int fact(int x) {
		if(x==0) {
			if(touched==false) {
				return 1;
			}
			x=1;
		}
		else 
		{
			touched = true;
			x=x*fact(x-1);
		}
		
		return x;
	}
}



public class factorial {
	public static void main(String[] args) {
		int a=0;
//	factorial f = new factorial();
	fact b = new fact();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any value for factorial:");
	a=s.nextInt();
	System.out.println(b.fact(a));
	
	}
}
