//import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
	//	Scanner s = new Scanner(System.in);
		int range=6,current=1,prev=0;
//		System.out.println("enter range");
//		range = s.nextInt();
		for(;current<range;current++)
		{
			
			current = current - (prev);
			System.out.println(current);
		}
//		for(int i=1;i<range;i++)
//		{
//			sum = sum +(i-1);
//			System.out.println(sum)
//		}
//		s.close();

	}

}
//0
//1    1
//1    1+0
//2    1+1
//3    1+2
//5    3+2