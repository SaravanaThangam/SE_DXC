import java.util.*;
public class array {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4};
		
//		System.out.println(a.length);
		
//		for(int i=0; i<a.length;i++) {
////			System.out.println(a[i]);
//			if(a[i]==3)
//			{
//				System.out.println(" value 3 is present");
//				
//			}
//			else {
//				if(i==a.length) {
//					System.out.println("value is not present");
//				}
//			}
//		}
//	}
//}

try {
	System.out.println(a[10]);
}
catch(Exception E)
{
	System.out.println("in catch block");
	E.printStackTrace();
}finally {
	Thread.sleep(2 * 1000);
	System.out.println("closing application");
}
	}
}
