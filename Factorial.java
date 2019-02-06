import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n= s.nextInt();
//		int fact = 1 ;
		
		if(n==1 || n==0) {
			
			System.out.println("Factorial of"  + n + "is 1");
			
		}
		else {
			System.out.println(fact(n));
		}
		
	}
	public static int fact(int n) {
		
// if(n>1) {
		int i;
		int fact=1;
		for(i=2;i<=n;i++) {
			fact= fact*i;		
		}
		return(fact);
	}
	
}	



