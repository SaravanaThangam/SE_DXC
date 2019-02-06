public class Switch {
	private static Scanner sc;
	public static void main(String[] args) {
		int number1, number2;
		char operator;
		sc = new Scanner(System.in);	
		System.out.println(" Please Enter two values to perform Arithmetic Operations ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(" Please select any ARITHMETIC OPERATOR You wish!\n");
		operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.format("Addition of two numbers is: %d", number1 + number2);
		    break;
		case '-':
			System.out.format("Subtraction of two numbers is: %d", number1 - number2);
			break;
		case '*':
			System.out.format("Multiplication of two numbers is: %d", number1 * number2);
			break;
		case '/':
			System.out.format("Division of two numbers is: %d", number1 / number2);
			break;
		case '%':
			System.out.format("Module of two numbers is: %d", number1 % number2);
			break;
		default:
			System.out.println("You have entered the Wrong operator\n");
			System.out.println("Please enter the Correct operator such as +, -, *, /, %%");
			break; 
		}
	}
}