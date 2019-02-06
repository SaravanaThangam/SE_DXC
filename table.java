import java.util.*;
public class table {
	public static void main(String[] args) {
		int x,i;
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the table number:");
		x=z.nextInt();
		z.close();
		for(i=1;i<=10;i++)
		{
			int y;
			y=x*i;
			//System.out.println(y);
			System.out.println(x+"*"+i+"="+y);
		}
		
	}

}
