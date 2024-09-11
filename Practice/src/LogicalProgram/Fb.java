package LogicalProgram;

public class Fb 
{
	public static void main(String[] args)
	{
		int o= 10;
		int p=0;
		int n=1;
		for(int i=1;i<=o;i++)
		{
			System.out.print(p+ " ");
			int sum= p+n;
			p= n;
			n=sum;
		}
		
	}

}
