package LogicalProgRamPractice;

public class ArmStorngNumber {
	public static void main(String[] args) {
		

		for(int i=0;i<=10000;i++)
		{
			int sum=0;
			for(int j=i;j>0;j=j/10)//j=j/10 is remove the last digit from number
			{
				int rem=j%10; //this we get last digit from number
				sum=(rem*rem*rem)+sum;
			}
			if(sum==i)
			{
				System.out.println(i);
				
			}
		}
		//---------------------------------------
	
	int m=153;
	
	int sum=0;
	
	for(int i=m;i>0;i=i/10)
	{
		int rem=i%10;
		sum=(rem*rem*rem)+sum;
	}
	
	if(sum==m)
	{
		System.err.println("given number is armstorng number");
	}
	
	}
}
