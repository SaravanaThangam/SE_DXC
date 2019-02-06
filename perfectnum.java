import java.util.*;
public class perfectnum {
	public static void main(String[] args)
	{
		int a,i,z=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the number to check if its perfect number or not:");
		a=c.nextInt();
		c.close();
		//if (a%2==0)
		//{
		for(i=1;i<=(a/2);i++)
		{
			
			if(a%i==0)
			{
				//z=i;
				System.out.println("Factors are:"+i);
				z=z+i;
			}
		}
				//System.out.println(z);
				if(z==a)
		{
			System.out.println(+a+" is a perfect number");
		}
			else
			{
				System.out.println(+a+" is not a perfect number");
			}
	}
}
