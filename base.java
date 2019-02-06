
public class base {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		System.out.println(a.length);
		for(int i=0;i<=a.length;i++)
		{
		System.out.println(a[i]);
		if(a[i] == 3)
		{
			System.out.println("value 3 present");
		}
		else
		{
			if(i == a.length)
			{
				System.out.println("value not present");
			}
		}
			
		}
		try {
			System.out.println(a[10]);
		}
		catch(Exception E)
		{
			System.out.println("in catch block");
			E.printStackTrace();
		}
		finally {
			System.out.println("closing application");
		}

}
}

