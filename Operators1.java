import java.util.*;

public class Operators1 {

	public static void main(String[] args) {
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
		if(c.equals("add"))
			System.out.println(add(a,b));
		else if(c.equals("mul"))
			System.out.println(mul(a,b));
		else if(c.equals("sub"))
			System.out.println(sub(a,b));
		else if(c.equals("div"))
			System.out.println(div(a,b));
		else
			System.out.println("Invalid operator name");
	}
public static int add(int a,int b) {
	return(a+b);}
	public static int mul(int a,int b) {
		return(a*b);}
	public static int sub(int a,int b) {
		return(a-b);}
	public static float div(int a,int b) {
		return(a/b);}
}



