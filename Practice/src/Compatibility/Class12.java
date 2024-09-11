package Compatibility;

public class Class12 
{
	public static double m1(int n)
	{
		
		
		int  sum =0;
		int count =0;
		for(int i=n;i!=0;i=i/10)
		{
			sum=sum+(i-(i/10)*10);
			count++;
		}
		return (double) sum/count;
		
	}
	public static void main(String[] args)
	{
		System.out.println(m1(543));
		System.out.println(m1(7623));
		
	}

}
