package first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addd add=new Addd();
		MUL multi=new MUL();
		
		add.value(5, 5); 
		multi.value(5, 5);
		
		System.out.print(add.add());
		
		System.out.println(multi.mul());
		
	}

}
