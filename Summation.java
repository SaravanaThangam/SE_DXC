import java.util.*;

public class Summation {

	public static void main(String[] args) {
		
		int a;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the first Number: ");
		
		
		a = s.nextInt();
		
		int sum = 0;
		
		
		System.out.println(sum (a));
		
		
		
		System.out.println(sum);
		
		
		
		}
	
	public static int sum (int num)
	{
		int b = 0;
		for (;num!=0;)
		{
			b = b + (num%10);
			num = num/10;
		}
		if (num>9){
			System.out.println(num);
			num = sum (num);
		}
			
		return (b);
	}

}
