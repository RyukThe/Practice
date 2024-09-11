package LogicalProgram;

public class febonacciq
{
	public static void main(String[] args) 
	{
		int n= 12;
		int prev=0;
		int next=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(prev + " ");
			int sum= prev+next;
			prev= next;
			next =sum;
		}
		
	}

}
