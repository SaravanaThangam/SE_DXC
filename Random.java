
public class Random {
 public static void main(String[] args) {
	double e =Math.random();
	System.out.println(e*10000);
	System.out.println(Math.ceil(e*10000));
	System.out.println(Math.floor(e*10000));
	System.out.println((int)(e*10000));
 }
}
