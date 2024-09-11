package LogicalProgram;

public class Class2 
{
	public static void main(String[] args)
	{
		int k=10;
		int prev=0;
		int next=1;
		for(int i=1;i<=k;i++)
		{
			System.out.print(prev+ " ");
			int sum= prev+next;
			prev=next;
			next = sum;
		}
		
	}

}
