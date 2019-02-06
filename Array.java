
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,2,3,4};
		
		int b = a.length;
		
		System.out.println("Length= " + a.length);
		
		for (int i=0;i<b;i++)
		{
			System.out.println(a[i]);
			if (a[i]==3)
			{
				System.out.println("3 is present in the array");
			}
		}

	}

}

