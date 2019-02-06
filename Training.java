import java.util.*;
public class Training {
	public static void main(String[] args) {
	int i;
	Scanner a=new Scanner(System.in);
	//i=a.nextLong();
	a.close();
	while(a.hasNextInt())
	{
		i=a.nextInt();
		System.out.println("integer");
	System.out.println(i);
	}
	
	System.out.println("not an integer");
	}
}

