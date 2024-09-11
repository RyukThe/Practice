package LogicalMarch;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int n=15;
		int pre=0;
		int next =1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(pre +  " ");
			int sum=pre+next;
			pre=next;
			next=sum;
		}
		
	}

}
