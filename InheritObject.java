    class basebase {
	void first() {
		System.out.println("First function");

	}
    }

	class derived extends basebase {
		void second() {
			System.out.println("second function");

		}
	}

	public class InheritObject {

		public void main(String[] args) {
			// TODO Auto-generated method stub
			basebase b = new basebase();
			b.first();

		}

	}

