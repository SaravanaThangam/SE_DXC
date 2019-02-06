import java.util.Scanner;

public class operator {
	
	public static void main(String[] args)
	{
		Scanner op=new Scanner (System.in);
		int a, b, c;
		System.out.println("enter the value a");
		a=op.nextInt();
		System.out.println("enter the value b");
		b=op.nextInt();
		System.out.println("enter the type of operator ");
		c=op.nextInt();
		if(c==1) {
			System.out.println("addition is " + add(a,b));
		}
		if(c==2) {
			System.out.println("substraction is " + sub(a,b));
		}
		if(c==3) {
			System.out.println("multiplication is " + mul(a,b));
		}
		if(c==4){
			System.out.println("divison is " + div(a,b));
		}
		
		op.close(); 
}
public static int add(int a,int b) {
	return(a+b);
}
	public static int sub(int a, int b) {
		return(a-b);
	
	}
	public static int mul(int a, int b) {
		return(a*b);
	}
	public static int div(int a, int b) {
		return(a/b);
	}
}

