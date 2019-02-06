package First;

public class Array {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		//int i;
		//System.out.println(a.length);
		/*{
			for(i=0;i<a.length;i++)
			{
				//System.out.println(a[i]);
			if(a[i]==3)
			{
				System.out.println("Yes");
			}
			else {
				if(i==a.length)
				{
				System.out.println("No");
			}
		}
			}*/
			try {
				System.out.println(a[10]);
			}
			catch(Exception E)
			{
				System.out.println("In Catch block");
				E.printStackTrace();
				}finally {
					Thread.sleep(2*1000);
					System.out.println("Closing the app...byeeee!!");
				}

	}
}
		

