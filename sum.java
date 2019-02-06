package First;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a" );
		a=s.nextInt();
		s.close();
		System.out.println(summation(a));
	}
public static int summation(int j) {
	int i=0;
	for(;j!=0;)
	{
		i=i+(j%10);
		j = j /10;
		}
	return (i);
	}
}