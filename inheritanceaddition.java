import java.util.Scanner;

//class parent
//{
//	public void add(double a, double b)
//	{
//		double c = a + b;
//		System.out.println("sum is:" +c);
//		System.out.println((int)(c));
//		
//	}
//}

class child extends parent
{
//	public double sub(double a, double b) { return a-b;}
//    public int sub(int a, int b) { return a-b;}
	
	public void sub(double a, double b)
	{
		double c = a - b;
		System.out.println(c);
		System.out.println((int)(c));
		
	}
}
	
public class inheritanceaddition {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 double a = s.nextDouble();
	 System.out.println("enter a");
	 double b = s.nextDouble();
	 System.out.println("enter b");
	  child f = new child();
	 f.add(a,b);
	 f.sub(a, b);
//	 System.out.println(f.sub(a, b));
	 s.close();
	}
	
}
