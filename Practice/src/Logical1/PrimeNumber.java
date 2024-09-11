package Logical1;

public class PrimeNumber 
{
	
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
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
			if(0==count)
			{
				System.out.println(i);
			}
		}
		m1();
		
	}
	
	
	
	public static void m1()
	{
		int n=3;
		int count =0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	

}
