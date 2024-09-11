package LogicalMarch;


public class RevreseNumber 
{
	public static void main(String[] args)
	{
		int num=854712457;
		
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=(rev*10)+rem;
		}
		
		System.out.println(rev);
		
		System.out.println("==========================================================================");
		
		int num2=123971451;
		String Str = Integer.toString(num2);
		String rev1="";
	
	
		for(int i=Str.length()-1;i>=0;i--)
		{
			rev1=rev1+Str.charAt(i);
		}
	
		int RN = Integer.parseInt(rev1);
		System.out.println(RN);
	}

}
