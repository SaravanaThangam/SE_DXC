import java.util.Scanner;

public class inheritance1 extends childclass{
	public void add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	inheritance1 demo = new inheritance1();
	demo.add(a,b);
	demo.sub(a,b);
	demo.div(a,b);
	
	
	
s.close();
	}

}

class childclass {
	 int c;
	 
	public void sub(int a, int b)
	{
		c = a- b;
		System.out.println(c);
	}
	public void div(int a, int b)
	{
		c = a % b;
		System.out.println(c);
	}
}