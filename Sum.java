package first;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner s = new Scanner (System.in);
 int a = s.nextInt();
 s.close();
 System.out.println(sumofDig(a));
 

	}

	public static int sumofDig(int number) {
		 int sum=0;
		for(; number!= 0;) {
			 sum = sum + (number % 10);
			 number=  number/10;
	}
		if(sum>9) {
		sum= sumofDig(sum);
}
		return sum;
}}
		
		 
 
 
		 
