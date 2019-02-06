package first;

 class B {//public will work only for its own class
	void foo() {
		System.out.println("Base");
	}
}

 class D extends B {
	void foo() {
		System.out.println("Derived");
	}
}

public class Anoop {// file name is the main class so public required
	public static void main(String[] args) {
		B b = new B();/// create a class for that object which you want 
	b.foo();
	}
} 
