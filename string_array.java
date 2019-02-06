import java.util.Scanner;

public class string_array {

	public static void main(String[] args) {
	   String array[] = {"keerthy","one","two","three"};
	   for(int i = 0; i<array.length;i++)
	   {
	   if(((array[i]).toUpperCase()).equals(("keerthy").toUpperCase()))
	   {
		   System.out.println("yes");
	   }
	   else {
		   System.out.println("no");
	   }
	   }
	   
	}

}
