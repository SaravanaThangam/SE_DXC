package oops;
import java.util.*;

public class Emp_details 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String a[] = new String[20];
		int b[] = new int[20];
		long c[] = new long[20];
		int d,e, option, option_1, option_2, count=0;
		int g, n, p;
		long h, m, o;
		String f, k, l[]= new String[20];
		System.out.println("How many employee details you want to store?");
		d=s.nextInt();
		for(int i=0;i<d;i++) {
			System.out.println("Enter the name of employee : ");
			a[i]=s.next();
		}
		for(int i=0;i<d;i++) {
			System.out.println("Enter age of " + a[i] + " : ");
			b[i]=s.nextInt();
		}
		for(int i=0;i<d;i++) {
			System.out.println("Enter the salary of " + a[i] + " : ");
			c[i]=s.nextLong();
		}
		for(int y=0;y<3;y++)
		{
		System.out.println("Please select below option \n 1. Add Employee details \n 2. Remove Employee details \n 3. Update Employee details \n 4. Show Employee details");
		option=s.nextInt();
		
		if(option==1) 
		{
			System.out.println("How many employee details you want to add extra ? ");
			e=s.nextInt();
			for(int i=d;i<(d+e);i++)
			{
				System.out.println("Enter the name of employee : ");
				a[i]=s.next();
			}
			
			for(int i=d;i<(d+e);i++)
			{
				System.out.println("Enter age of " + a[i] + " : ");
				b[i]=s.nextInt();
			}
			for(int i=d;i<(d+e);i++)
			{
				System.out.println("Enter the salary of " + a[i] + " : ");
				c[i]=s.nextLong();
			}
			System.out.println("Your record has been added successfully");
		}
			
		if(option==2) 
		{
			System.out.println("Please select from below options \n 1. Search via Employee Name \n 2. Search via Employee age \n 3. Search via Employee Salary");
			option_1=s.nextInt();
			if(option_1==1) 
			{
				System.out.println("Please enter Employee Name: ");
				f=s.next();
				for(int i=0;i<a.length;i++)
				{
					if(a[i].toUpperCase().equals(f.toUpperCase())) 
					{
						for(int j=i;j<(a.length-1);j++) {
							a[j]=a[j+1];
							b[j]=b[j+1];
							c[j]=c[j+1];
						}
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("Entered employee name not found");
				}
				else
				{
					System.out.println("Entered employee data removed successfully");
				}
			
			}
			if(option_1==2) 
			{
				System.out.println("Please enter Employee Age: ");
				g=s.nextInt();
				for(int i=0;i<b.length;i++)
				{
					if(b[i]==g) 
					{
						for(int j=i;j<(a.length-1);j++) {
							a[j]=a[j+1];
							b[j]=b[j+1];
							c[j]=c[j+1];
						}
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("Entered employee age not found");
				}
				else
				{
					System.out.println("Entered employee data removed successfully");
				}
			
			}
			if(option_1==3) 
			{
				System.out.println("Please enter Employee Salary: ");
				h=s.nextLong();
				for(int i=0;i<c.length;i++)
				{
					if(c[i]==h) 
					{
						for(int j=i;j<(a.length-1);j++) {
							a[j]=a[j+1];
							b[j]=b[j+1];
							c[j]=c[j+1];
						}
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("Entered employee age not found");
				}
				else
				{
					System.out.println("Entered employee data removed successfully");
				}
			
			}
		}
		if(option==3)
		{
			System.out.println("Please select from below options \n 1. Update Employee Name \n 2. Update Employee age \n 3. Update Employee Salary");
			option_2=s.nextInt();
			if(option_2==1) 
			{
				System.out.println("Please enter Employee Name which requires updation: ");
				k = s.next();
				for(int i=0;i<a.length;i++)
				{
					if(a[i].toUpperCase().equals(k.toUpperCase())) 
					{
						if(a[i]!=null)
						{
							for(int j=0;j<1;j++)
							{
								System.out.println("Enter the new value for " + a[i] + ":");
								l[j]=s.next();
								a[i]=l[j];
							}
						}
						break;
					}
				}
				System.out.println("Entered employee name updated successfully");
			}
			if(option_2==2) 
			{
				System.out.println("Please enter Employee Age which requires updation: ");
				n = s.nextInt();
				for(int i=0;i<b.length;i++)
				{
					if(b[i]==n) 
					{
						System.out.println("Enter the new value for " + b[i] + ":");
						p=s.nextInt();
						b[i]=p;
					}
				}
				System.out.println("Entered employee age updated successfully");
			}
			if(option_2==3) 
			{
				System.out.println("Please enter Employee salary which requires updation: ");
				m = s.nextLong();
				for(int i=0;i<c.length;i++)
				{
					if(c[i]==m) 
					{
						System.out.println("Enter the new value for " + c[i] + ":");
						o=s.nextLong();
						c[i]=o;
					}
				}
				System.out.println("Entered employee salary updated successfully");
			}
		}
		if(option==4)
		{
			System.out.println("Employee Name \t || Employee Age || \t Employee Salary");
			for(int i=0;i<a.length;i++)
			{
				if (a[i]!=null)
				{
				System.out.println(a[i] + "\t || " + b[i] + " || \t " + c[i]);
				}
			}
		}
	}
		s.close();
	}
}
