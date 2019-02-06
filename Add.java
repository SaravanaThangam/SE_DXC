package first;
import java.util.Scanner;
public class Add {
	
	static Scanner s = new Scanner(System.in);
	static int a;
	static int b;
        public static void main(String[] args) { 
                // TODO Auto-generated method stub 
                 
                
                int  c,d,e; 
              
                System.out.println("Kindly press 1 for add, 2 for sub, 3 for mul, 4 for div "); 
                c = s.nextInt(); 
                if(c == 1) { 
                	inputab();
                	    System.out.println("Result is " + add(a,b));    
                }
                else if(c==2) {
                inputab();
                	System.out.println("result of subtraction is " + sub(a,b) );
                }
                else if(c==3) {
                inputab();
                	System.out.println("Enter the value of D: ");
                	d=s.nextInt();
                	System.out.println("reult of mul is " + mul(a,b,d));
                }
                else if(c==4) {
                	System.out.println("Enter a value : "); 
                    a = s.nextInt(); 
                	System.out.println("Enter the value of e: ");
                	e=s.nextInt();
                	System.out.println("reult of div is " + div(e,a));
                }
                else {
                	System.out.println("What the Hell is wrong with you ?? have a look and give correct value.");
                }
                s.close(); 
        } 
        
        public static void inputab() {
        	System.out.println("Enter a value : "); 
            a = s.nextInt(); 
            System.out.println("Enter b value : "); 
            b = s.nextInt();   
        }
        
        public static int add(int a,int b) { 
                return (a+b); 
        } 
        public static int sub(int a, int b) {
        	return(a-b);  
        }
        public static int mul(int a, int b, int d) {
        	return(a*b*d);
        }
        public static int div(int a, int e) {
        	return(e/a);
}
}
