import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello Akshay!! Welcome to Eclipse!!");
		//System.out.println("Good morning!!");
		Scanner a = new Scanner(System.in);
		
		String b = a.nextLine();
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		
		int num3 = num1 + num2;
		
		System.out.println("Sum = "+ num3);
//		System.out.println("Hello Akshay!! Welcome to Eclipse!!");
//		System.out.println("Good morning!!"+ b);
		
		a.close();
		
		

	}

}
