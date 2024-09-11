package LogicalMarch;

public class Fibonacci1 
{
	public static void main(String[] args) 
	{
		int pre=0;
		int next=1;
		for(int i=1;i<=10;i++)
		{
			System.out.print(pre+ " ");
			int sum=pre+next;
			pre=next;
			next=sum;
		}
		
	}

}
