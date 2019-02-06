package basic;

class Base {
Base(){}
Base(int i) {}
protected void foo() {}
}

class Derived extends Base {
	Derived(){}
	protected void foo() {}
	Derived(int i) {
		super(i);
		super.foo();
		
	}
}
