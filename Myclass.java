package oops;

public class Myclass {
	//  static void myMethod() {
	  //  System.out.println("I just got executed!");
	//  }

	//  public static void main(String[] args) {
	//    myMethod(); //Inside main, call the myMethod() method:
	//  }
	//}

//static void myMethod(String fname) {
  //  System.out.println(fname + " Refsnes");
  //}

 // public static void main(String[] args) {
   // myMethod("Liam"); //Information can be passed to functions as parameter.
 //   myMethod("Jenny");
 //   myMethod("Anja");
//  }
//}
		//static int myMethod(int x) {
	 //   return 5 + x;
	 // }

	 // public static void main(String[] args) {
//	    System.out.println(myMethod(3)); //Return Values using methods

	//  } 
	  
	  
	// Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!"); 

	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!"); 
	    }

	  } 

	  public static void main(String[] args) { 
	    checkAge(18); // Call the checkAge method and pass along an age of 20
	  } 
	}



