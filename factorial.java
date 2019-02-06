import java.util.*;

public class factorial {
	
	public static void main(String[] args) {
		int a;
		int fact=1;
		Scanner w=new Scanner(System.in);
		System.out.println("Enter the number");
		a=w.nextInt();
		if (a==0 || a==1) {
			System.out.println("Factorial is "+a);
		}
		else {
			System.out.println(fact(a));
		}
	}
	public static int fact(int a)
	{
		
	
//		int i;
//int fact=1;
//		for(i=2;i<=a;i++)
//		{
//			
//			fact=fact*i;
//			
//			}
		return(a*fact(a-1));
}

}
