import java.util.Scanner;

public class ABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "Alex", "Patric", "Jonny" };
		String b;
		System.out.println("Enter the name to be checked");
		Scanner s = new Scanner(System.in);
		b = s.next();
		for (int i = 0; i < a.length; i++) {
			if (a[i].contentEquals(b)) {
				System.out.println("found");
			}
		}

	}

}
