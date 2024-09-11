package LogicalProgram;

public class Fibonacci
{
	public static void main(String[] args) 
	{
		int n= 10;
		int prv=0 ,next =1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(prv+" ");
			int sum=prv+next;
			prv=next;
			next =sum;
			
			
		}
		
	}

}
