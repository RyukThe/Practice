package LogicalProgram;

public class ReverserNumber 
{
	public static void main(String[] args) 
	{
		int k=451248541;
		int r=0;
		
		for(int i=k;i>0;i=i/10)
		{
			int rem=i%10;
			r=r*10+rem;
		}
		
		
		System.out.println(r);
	}

}
