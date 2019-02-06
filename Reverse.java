package oops;

//public class Reverse{
//   public static void main(String[] args) {
//      String string = "abcdef";
//      String reverse = new StringBuffer(string).reverse().toString();
//      System.out.println("\nString before reverse: "+string);
//      System.out.println("String after reverse: "+reverse);
//   }
//}

public class Reverse {   
	   public String reverseString(String str){
	   
	      if(str.isEmpty()) 
	      {                          // Using recursion
	         return str;
	      } else {
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	   } 
	   public static void main(String[] args) {
	      Reverse obj = new Reverse();
	      String result = obj.reverseString("PAP");
	      System.out.println(result);
	   }
	}