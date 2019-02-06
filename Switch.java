package First;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	int n,add,sub,div,a=5,b=0;
	System.out.println("Enter n" );
	n=s.nextInt();
	switch(n)
	{
		case 1:
			add=a+b;
			System.out.println("add"+add);
		break;
		case 2:
			sub=a-b;
			System.out.println("sub"+sub);
		break;
		case 3:
			div=a/b;
			System.out.println("div"+div);
		break;
		case 4:
			System.out.println("default");
		break;
			
	}
}
}
