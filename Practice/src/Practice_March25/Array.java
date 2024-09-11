package Practice_March25;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args) 
	{
		String [] ar= new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println("Enter Name");
			String str = sc.nextLine();
			ar[i]=str;
		}
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

	
	protected static void $k1d()
	{
		System.out.println("method is proected ");
	}
	
	static void m1()
	{
		System.out.println("Default method");
	}
}
