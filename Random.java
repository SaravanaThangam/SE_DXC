
public class Random {

	public static void main(String[] args) {
		double a = Math.random();
		System.out.println(a*10000);
		System.out.println(Math.ceil(a*10000));
		System.out.println(Math.floor(a*10000));
		System.out.println((int)(a*10000)); 

	}

}
