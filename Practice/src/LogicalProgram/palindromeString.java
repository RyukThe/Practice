package LogicalProgram;

public class palindromeString 
{
	public static void main(String[] args)
	{
		String s="madam";
		String rev="";
		 
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		
		if(s.equals(rev))
		{
			System.out.println(s + " - Given String is palindrome");
		}
		else
		{
			System.out.println( s+ " - Given String is not Palindrome");
		}
		
		//-------------------------------------------------
		
		
	}

}
