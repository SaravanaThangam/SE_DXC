
public class try_catch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };

		try {
			System.out.println("In Catch block");
		System.out.println(a[10]);
	} catch(Exception e) {
		e.printStackTrace();
	}
		finally {
			Thread.sleep(2*1000);
			System.out.println("closing application");
			
		}
	
	}



	}