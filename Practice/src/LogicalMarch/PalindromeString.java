package LogicalMarch;

public class PalindromeString
{
	public static void main(String[] args)
	{
		String str="madam";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Pallindrome");
		}
		else
		{
			System.out.println("Given String is not Pallindrome");
		}
		
	}

}
