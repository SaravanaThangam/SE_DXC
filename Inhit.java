package basic;
class firststep { 
	void foo()
	{
		System.out.println("Base");
	}
}

class secondstep extends firststep {
	void foo()
	{
		System.out.println("Derived");
	}
}


public class Inhit {

	public static void main(String[] args) {
		firststep b = new firststep();
		b.foo();

	}

}
