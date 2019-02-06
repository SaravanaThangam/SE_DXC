package First;

class Base1 {
	void foo1()
	{
		System.out.println("Base");
	}
}
class Derived1 extends Base1{
	void foo1() {
		System.out.println("Derived");
	}
}
public class Inhit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b = new Base1();
		b.foo1();

	}

}
