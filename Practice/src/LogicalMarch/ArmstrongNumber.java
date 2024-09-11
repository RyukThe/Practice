package LogicalMarch;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		for(int i=0;i<=1000;i++)
		{
			int sum=0;
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		
	}

}
