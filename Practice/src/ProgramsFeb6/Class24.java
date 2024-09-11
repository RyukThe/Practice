package ProgramsFeb6;

import java.util.Scanner;

public class Class24
{
	public static void main(String[] args) 
	{
		Scanner l= new Scanner(System.in);
		System.out.println("Enter number");
		
		int num;
		do
		{
			num=l.nextInt();
			System.out.println("Enter number between 10 to 50");
		}while(num<10||num>50);
		
		
		
		for(int i=num;i<=50;i++)
		{
			int  count =0;
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
		
	}

}
