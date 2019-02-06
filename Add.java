package oops;


import java.util.*;
public class Add
{
public static void main(String[] args)
{
Scanner s = new Scanner (System.in);

int a,b,c;
System.out.println("Enter a" );
a=s.nextInt();
System.out.println("Enter b" );
b=s.nextInt();
System.out.println("Operation ?");

c=s.nextInt();
	   if(c==1)
	   {
		   System.out.println("Result is = " +add(a,b));
		   
	   }
if(c==2)
{
   System.out.println("Result is = " +sub(a,b));
   
}
	 
s.close();
}
public static int add(int a,int b)
{
return (a+b);

}
public static int sub(int a,int b)
{
return (a-b);

}
}
