package oops;

public class Constructor {
	
	int x;
	
	public Constructor(int y) {
		
		x = y;
	}
	public static void main(String[] args) {
		Constructor myObj = new Constructor(5);
		System.out.println(myObj.x);
		
		Constructor myObj1 = new Constructor(50);
		System.out.println(myObj1.x);

	}

}
