package oops;

//import java.time.LocalDate;

//public class MyClass1 {
//
//	  int x = 5;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//			    MyClass1 myObj = new MyClass1();  //Create an object called "myObj" and print the value of x:
//			    myObj.x = 40;
//			    System.out.println(myObj.x);
//			  }
//	}



	// Create a MyClass class
//	public class MyClass1 {
//	  int x;  // Create a class attribute
//
//	  // Create a class constructor for the MyClass class
//	  public MyClass1() {
//	    x = 5;  // Set the initial value for the class attribute x
//	  }
//
//	  public static void main(String[] args) {
//	    MyClass1 myObj = new MyClass1(); // Create an object of class MyClass (This will call the constructor)
//	    System.out.println(myObj.x); // Print the value of x
//	  }
//	}



//public class MyClass1 {
//	  // Static method
//	  static void myStaticMethod() {
//	    System.out.println("Static methods can be called without creating objects");
//	  }
//
//	  // Public method
//	  public void myPublicMethod() {
//	    System.out.println("Public methods must be called by creating objects");
//	  }
//
//	  // Main method
//	  public static void main(String[ ] args) {
//	    myStaticMethod(); // Call the static method
//	    // myPublicMethod(); This would output an error
//
//	    MyClass1 myObj = new MyClass1(); // Create an object of MyClass
//	    myObj.myPublicMethod(); // Call the public method
//	  }
//	}


import java.time.LocalTime; // import the LocalTime class

import java.time.LocalDate; // import LocalDate

public class MyClass1 { 
  public static void main(String[] args) { 
    LocalTime myObj1 = LocalTime.now();
    LocalDate myObj2 = LocalDate.now(); // Create a date object
    System.out.println(myObj1); // Display the current date
    System.out.println(myObj2);
  } 
}
