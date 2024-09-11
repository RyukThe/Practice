package LogicalProgram;

import org.testng.annotations.Test;


final public class Factorial
{
	
	
	@ Test
	private void m()
	{
		int n=5;
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
	
	//----------------------------------
	
	@Test
	 public void m12()
	{
		for(int i=1;i<=10;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			
			System.out.println( +(fact));
		}
		
	}
	
	
	

}
