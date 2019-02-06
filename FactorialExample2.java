package oops;

class FactorialExample2{   
 static int factorial(int n){    
  if (n == 0)  {  
    return 1;  
  }
  else    
  {
    return(n * factorial(n-1));    
 }   } 
 public static void main(String args[]){    
  int number=0; 
  int fact = factorial(number);   //number to calculate factorial 
  //System.out.println("Enter a number");
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

