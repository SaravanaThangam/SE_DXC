
public class inhit {
	public static void main(String[] agrs) {
		base b = new base();
		b.foo(); // base.foo will be activated
	}
}

class base {
	void foo() {
		System.out.println("Base");
	}
}

class Dev extends inhit {
	void foo() {
		System.out.println("Derived");
	}
}
