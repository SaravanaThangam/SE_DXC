import java.util.*;

public class Operators {
	
	public static void main(String[] args)
	{
		Scanner op=new Scanner(System.in);
		int a=0,b=0;
		String c;
		System.out.println("Enter the first number:");
		a=op.nextInt();
		System.out.println("Enter the second number:");
		b=op.nextInt();
		System.out.println("Enter the operation name(add/mul/sub/div):");
		c=op.next();
		op.close();
		
         if(c.equals("add"))
		{
        	 
		 System.out.println(a+b);}
		else if(c.equals("mul")) {
			
		System.out.println(a*b);}
	else if(c.equals("sub")) {

		System.out.println(a-b);}
	else if(c.equals("div")) {
			
		System.out.println(a/b);}
         
	else
		System.out.println("Invalid operator name");}
}

	
	
