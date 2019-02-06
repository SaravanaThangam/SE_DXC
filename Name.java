package First;

import java.util.Scanner;

public class Name {
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	String a[] = {"Mamm","Niki","Sin","Suba","BB","DD"};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	
	if((a[i].toUpperCase()).equals(("Mamm").toUpperCase())){
		System.out.println("Found!!");
	}
	else
	{
		System.out.println("Not Found..byee!!");
	}
	}
	}
}

