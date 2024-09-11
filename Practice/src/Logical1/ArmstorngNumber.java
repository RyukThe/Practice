package Logical1;

public class ArmstorngNumber
{
	public static void main(String[] args) 
	{
		int num=153;
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
			
		}
		if(num==sum)
		{
		System.out.println("given number is Aramstrong");
		}
		else
		{
			System.out.println("Given number is not armstorng ");
		}
		
		for(int i=0;i<=10000;i++)
		{
			int sum1 =0;
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				sum1=(rem*rem*rem)+sum1;
				
			}
			if(i==sum1)
			{
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		int k=153;
		int suwm=0;
		for(int i=k;i>0;i=i/10)
		{
			int rem=i%10;
			suwm=suwm+(rem*rem*rem);
			
		}
		
		if(k==suwm)
		{
			System.out.println("Armstorng");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
