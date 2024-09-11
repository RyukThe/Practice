package LogicalMarch;

import java.util.Scanner;

public class RevNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num = sc.nextInt();
		int revnum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revnum=revnum*10+rem;
		}
		
		
System.out.println(revnum);
	}
	

}
