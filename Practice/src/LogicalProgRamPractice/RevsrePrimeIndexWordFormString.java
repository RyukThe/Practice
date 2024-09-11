package LogicalProgRamPractice;

public class RevsrePrimeIndexWordFormString {

	public static void main(String[] args) {
		
		String s="hellow my name is saurav";
		String []sr=s.split(" ");
		//System.out.println(isprime(4));
		for(int i=0;i<sr.length;i++)
		{
			if(isprime(i))
			{
				System.out.print(rev(sr[i])+" ");
			}
			else
			{
				System.out.print(sr[i]+" ");
			}
		}
	}
	
	private static String rev(String s) 
		{
		
		String s1=s;
		String  rev="";
			for(int i=s1.length()-1;i>=0;i--)
			{
				rev=rev+s1.charAt(i);
			}
			
		return rev;
		}
	
	
	
	private static boolean isprime(int j) 
	{
		
		if(j<2)
		{
			return false;
		}
		
		for(int i=2;i*i<=j;i++)
		{
			if(j%i==0)
			{
				return false;
			}
		}
		
		return true;
		
		
	}
}
