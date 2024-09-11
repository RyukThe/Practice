package LogicalProgram;

public class AramstrongNumber 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10000;i++)
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
		
		//-------------------------------------------------------------------------------
		 int n= 153;
		 int sum=0;
		  
		 for(int i=n;i>0;i=i/10)
		 {
			 int rem=i%10;
			 sum=sum+(rem*rem*rem);
			 
		 }
		 
		 if(sum==n)
		 {
			 System.out.println(n + " given number is ArmStrong number");
		 }
		
	}

}
