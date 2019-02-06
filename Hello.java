import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int age = s.nextInt();
		String a = s.nextLine();
		System.out.println("Name " + a + " , years of experience " + age);

		s.close();

	}

}
