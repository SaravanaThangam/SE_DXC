import java.util.*;

public class polymorphism {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a ;
		a= s.nextInt();
		s.close();
		System.out.println(sod(a));
		
		
}
	public static int sod(int n)
	{
	int s=0;
	while(n!=0)
		{
		s = s + (n%10);
		n = n / 10;
	}
	if(s>10)
	{
		s = sod(s);
	}
	return s;
}
}

