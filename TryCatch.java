
public class TryCatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };

		try {
			System.out.println(a[10]);
		} catch (Exception e) {
			System.out.println("In Catch Block");
			e.printStackTrace();

		} finally {
			Thread.sleep(2 * 1000);
			System.out.println("closing application");
		}

	}

}
