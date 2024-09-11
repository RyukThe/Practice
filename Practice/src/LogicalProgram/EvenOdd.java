package LogicalProgram;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+ " is even");
		}
		else if(num%2!=0)
		{
			System.out.println(num+" is odd");
		}
		//---------------------------------------------------------------------------
		
		
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + " is even");
			}
			else if(i%2!=0)
			{
				System.out.println( i + " is odd");
			}
		}
		
		
		//----------------------------------------------------------
		
		int num1;
		do
		{
			System.out.print("Enter number ");
			num1=sc.nextInt();
			System.out.println("Enter number between 10 to  50");
			
		}while(num1<10|| num1>50);
		for(int i=num1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + " is even");
			}
			else if(i%2!=0)
			{
				System.out.println( i + " is odd");
			}
		}
		
	}

}
