import java.util.Scanner;
public class Fact_Recurr{     
 public static void main(String args[]){ 
	// TODO Auto-generated method stub
	 int i; 
	 System.out.println("Enter a number:");
	 Scanner s = new Scanner (System.in);
	 int a = s.nextInt();
  
	 fact = facto(a);   
	 System.out.println("Factorial of "+a+" is: "+fact);    
 }  
 			static int facto(int n){
 				int fact = 1;
 				boolean touched = false;
 					if (n == 0){
 						
 						if(touched == false){
 						return 1;
 						}
 						else{
 							return fact;
 						}
 					}
 						    
 					else 
 					{
 						touched = true;
 						return (n * facto(n-1));
 						
 					}
	 } 
}  