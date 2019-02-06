import java.util.*;

public class Hello {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ENter your Name");
		String name = s.nextLine();
		System.out.println("ENter your age");
		int age  = s.nextInt();
		System.out.println("Name is " + name + " & Age is " + age );
		s.close();

	}

}
