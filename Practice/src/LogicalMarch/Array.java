package LogicalMarch;

public class Array 
{
	public static void main(String[] args) 
	{
		
		int pre = 0;
		int next=1;
		for(int i=1;i<=12;i++)
		{
			System.out.print(pre +" ");
			int sum=pre+next;
			pre=next;
			next=sum;
		}
		
	}

}
