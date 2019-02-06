import java.util.Scanner;
class Inhert_oper {
       int z;
       void addition(int a,int b) {
             z=a+b;
       System.out.println("Sum is:"+z);}
       void mult(int a,int b) {
             z=a*b;
       System.out.println("mul is:"+z);}
       void subtraction(int a,int b) {
             z=a-b;
             System.out.println("sub is:"+z);}
       void division(int a,int b) {
             z=a/b;
             System.out.println("Div is:"+z);}
       
}

class Tub extends Inhert_oper{
       void mod(int a,int b) {
             z=a%b;
             System.out.println("mod is:"+z);}
//     void percentage(int a,int b) {
//           System.out.println("percentage is:"+((a+b)/100));
//}

public static void main(String[] args)
{
       int m,n;
       String result;
       Scanner inh=new Scanner(System.in);
       System.out.println("Enter the first number:");
       m=inh.nextInt();
       System.out.println("Enter the second number:");
       n=inh.nextInt();
       System.out.println("Enter the operator:");
       result=inh.next();
       inh.close();
       Tub r=new Tub();
       if(result.equals("addition"))
             r.addition(m,n);
       else if(result.equals("multiplication"))
             r.mult(m,n);
       else if(result.equals("subtraction"))
       r.subtraction(m,n);
       else if(result.equals("divsion"))
             r.division(m,n);
//     else if(res.equals("percentage"))
//           r.percentage(a,b);
       else 
             System.out.println("Invalid operator name");
}
}
       




 
