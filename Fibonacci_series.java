package Second;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n;
		System.out.println("Enter n");
		n=s.nextInt();
		s.close();
		System.out.println(fibonacci(n));
	}
        static int fibonacci(int f)
        {
        	int a=0,b=1,t=0;
        	if(f<0)
        	{
        		return 0;
        	}
        	else
        	{
            for(int i=2;i<f;i++)
            {
            t=a+b;
            System.out.println(t);
        	a=b;
        	b=t;
        	}
        	}
        }
}