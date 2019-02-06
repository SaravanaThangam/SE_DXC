package oops;

public class Final_obj 
{

	int a= 5;
	//final int a= 5; we can not declare this as final
	public static void main(String[] args)
	{
		Final_obj obj = new Final_obj();
		obj.a = 10;
		System.out.println(obj.a);
	}
	
}
