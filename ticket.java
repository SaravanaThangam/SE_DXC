import java.util.*;

public class ticket {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("Enter the number of tickets:");
int n = s.nextInt();
int sum = 0,age;
if((n>1) && (n<=4)) {
	for(n=1;n<=4;n++) {
		
		age= s.nextInt();
		
		if((age>20)&& (age<=30)) {
			sum = sum + 200;
		}
		if((age>30)&& (age<=40)) {
			sum = sum + 300;
		}
		if((age>40)&& (age<=50)) {
			sum = sum + 400;
		}
		if((age>50) || (age<=20)) {
			sum = sum + 100;
		}
	
}
}
	else {
		System.exit(0);
	}
	System.out.println(sum);
}

	

	}


