class bbbase {
	double add(double a, double b) {
		return (a + b);
	}

	double sub(double a, double b) {
		return (a - b);
	}

}

class deriveBase extends bbbase {
	int add(int a, int b) {
		return (a + b);
	}

	int sub(int a, int b) {
		return (a - b);
	}
}

public class InheritEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2342.6443, b = 1875.3563;

		bbbase b1 = new bbbase();
		deriveBase b2 = new deriveBase();
		b1.add(a, b);
		b1.sub(a, b);
		b2.add(a, b);
		b2.sub(a, b);

		System.out.println(b1.add(a, b));
		System.out.println(b1.sub(a, b));
		System.out.println((int)(b2.add(a, b)));
		System.out.println((int)(b2.sub(a, b)));
	}

}
