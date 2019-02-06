import java.util.Scanner;

public class Switch {
public static void main(String[] args)
{
	int a,b;
	String c;
	Scanner op1=new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=op1.nextInt();
	System.out.println("Enter the second number:");
	b=op1.nextInt();
	System.out.println("Enter the operator name(add/mul/sub/div):");
	c=op1.next();
	op1.close();
	switch(c)
	{
		
		case "add":
		System.out.println(a+b);
		break;
		
		case "mul":
		System.out.println(a*b);
		break;
		case "div":
			System.out.println(a/b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
	default:
	System.out.println("Invalid operator name");
	
	break;
	}
}
}
