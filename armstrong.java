import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x,sum=0;
		System.out.println("enter a");
		int a = s.nextInt();
		while(a!=0)
		{		
			
			x=a%10;
			sum = (x*x*x) + sum;
			a=a/10;			
			
		}
		System.out.println("armstrong number of a is:" +sum);
		s.close();
	}


}
