package LogicalProgRamPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++)
		{
			int count=0;
			for(int j=2;j>i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
		}
		
//---------------------
		
		int num=3;
		int count=0;
		for(int i=2;i>num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("number is prime number");
		}
	}
	
}
