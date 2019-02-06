package oops;

public class Multi_Obj
{
	int x=5;
	
	public static void main(String[] args)
	{
		Multi_Obj Oj1 = new Multi_Obj();
		Multi_Obj Oj2 = new Multi_Obj();
		
		Oj2.x = 10;
		
		System.out.println(Oj1.x);
		System.out.println(Oj2.x);
		
	}
	

}
