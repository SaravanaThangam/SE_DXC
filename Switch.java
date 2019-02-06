import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter a:");
		
		int a = s.nextInt();
		
		System.out.println("enter B:");
		
		int b = s.nextInt();
		
		System.out.println("Enter Opration:");
		
		int c = s.nextInt();
		
		switch (c){
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		default:
			System.out.println(a/b);
			break;
		}
		

	}

}
