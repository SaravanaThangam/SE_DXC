
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			if(a[i]==3) {System.out.println("found");
			//System.exit(0);
			}
			else {
				if(i==a.length){
					System.out.println("not found");
				}
			}
		}
	}
}