import java.util.*;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String names[] = { "Manimegalai", "Sindhu", "Nikila", "Binitha", "jp", "subha", "mandeep" };
		System.out.println("Enter the name you want to check:");
		String chkname;
		chkname = s.next();
		System.out.println(chkname);
		s.close();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			if (names[i].equalsIgnoreCase(chkname)) {
				System.out.println(chkname + " is found in array");
			}
		}

	}

}
