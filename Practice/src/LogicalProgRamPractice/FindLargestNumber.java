package LogicalProgRamPractice;

import java.util.Scanner;

public class FindLargestNumber {

	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int a=s.nextInt();
		System.out.print("Enter 2nd number :");
		int b=s.nextInt();
		System.out.print("Enter 3rd number :");
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		
		else if(b>a && b>c )
		{
			System.out.println(b+"  is largest number ");
		}
		
		else  if(c>a  && c>b)
		{
			System.out.println( c+ " is largest number");
		}
		
	}
}
