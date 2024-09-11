package LogicalMarch;

public class primenumberm 
{
	public static void main(String[] args) {
		int num=4;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("numver is not prime");
		}
		
		prime();
	}
	
	
	
	
	public static void prime()
	{
		for(int i=1;i<=1000;i++)
		{
			int count=0;
	
			for(int j=2;j<i;j++)
			{
			if(i%j==0) {
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
