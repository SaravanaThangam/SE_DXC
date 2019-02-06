import java.util.Scanner;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticket();
		
				
	}
	
	public static  void ticket() {
		// TODO Auto-generated method stub
		int a, b, basic_rate = 100, sum = 0, total = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of tickets (maximum 4 tickets allowed)");
		a = s.nextInt();
		if (a < 1 || a > 4) {
			System.out.println("Invalid choice");
			System.exit(0);
		}

		else {
			for (int i = 1; i <= a; i++) {
				System.out.println(
						"select Agegroup from menu for ticket number " + i + "\n 1.1-10\n 2.10-30\n 3.30 onwards\n");
				b = s.nextInt();
				switch (b) {
				case 1:
					sum = basic_rate;
					break;
				case 2:
					sum = (basic_rate + 200);
					break;
				case 3:
					sum = (basic_rate + 300);
					break;
				default:
					System.out.println("something went wrong");
				}
				total = total + sum;

			}
			System.out.println("total amount to be paid " + total);
		}

		s.close();
	}

	class Derived extends inheritance{
		inheritance d= new inheritance();
		//d.ticket();
	}
	

}
