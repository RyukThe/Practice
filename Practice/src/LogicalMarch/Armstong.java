package LogicalMarch;

public class Armstong 
{
	public static void main(String[] args)
	{
		
		for(int i=0;i<=1000;i++)
		{
			int sum=0;
			for(int j=i;j>0;j=j/10)
			{
				int rem= j%10;
				sum=sum+(rem*rem*rem);
			}
			
			if(i==sum)
			{
				System.out.println(i);
			}
		}
		System.out.println("==================================================================================================");
		
		int num=153;
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
	
		if(sum==num)
		{
			System.out.println("given number is Armstorng");
		}
		else
		{
			System.out.println("Not ArmStorng ");
		}
		
	}

}
