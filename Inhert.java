class Base {
	void foo() {
		System.out.println("Base");
	}
}

 class Derived extends Base {
	void foo() {
		System.out.println("Derived");
		
	}
}

public class Inhert {
	public static void main(String[] args) {
		Base b = new Base();
		b.foo();
	}
	
}