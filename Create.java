package oops;

import java.util.Scanner;

public class Create {

	private String name;
	private int id ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void getStudetails()
	{
		System.out.println("Enter name");
		Scanner s = new Scanner (System.in);
		setName(s.nextLine());
	}
	

}
