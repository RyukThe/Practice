package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		
		int num;
		do
		{
			
			
			num=sc.nextInt();
			System.out.println("Enter number between 10 to 50");
			
		}while(num<10||num>50);
		
		for(int i =num;i<=50;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
			
		}
		//----------------------------------------------------
		
		
		
		
		for(int i=0;i<=1501;i++)
		{
			int count =0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
		}
		
		
		
		//----------------------------------------------------------
		
		int n= 5;
		int count=0;
		for(int i= 2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		
		if(count==0)
		{
			System.out.println(n + " is prime number");
		}
		else
		{
			System.out.println(n + "numaber is not prime");
		}
	}
	

}
