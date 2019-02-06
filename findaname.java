package basic;
import java.util.*;

public class findaname {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a[]={"Saravana","Thangam","Abhinaya","Padmavathi","Thangiah","Sundari"};
	String b;
//	System.out.println("List of names present in an array");
	System.out.println("Please enter any name to check whether is present");
	b=s.next();
	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
		if(a[i].toUpperCase().equals(b.toUpperCase())) {
//		if(a[i].equals(b)){
			System.out.println("Yes, entered value is present");
		}
		
} System.out.println("No, its not present");
	}
}
