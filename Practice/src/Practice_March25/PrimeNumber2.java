package Practice_March25;

import java.util.Scanner;

public class PrimeNumber2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int num;
		do
		{
			System.out.println("Enter number between 10 t0 50:");
			num=sc.nextInt();
			
		}while(num<10||num>50);
		
		
		
		for(int i=num;i<=50;i++)
		{
			int count=0;
			for(int j=2;j<num;j++)
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
