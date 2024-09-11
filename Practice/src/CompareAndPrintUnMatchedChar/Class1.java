package CompareAndPrintUnMatchedChar;

public class Class1
{
	public static void main(String[] args) 
	{
		  String str1 = "hello world";
	        String str2 = "hola mundo";
	        
	        for(int i=0;i<str1.length();i++)
	        {
	        	char ch=str1.charAt(i);
	        
	        	if(str2.indexOf(ch) == -1)
	        	{
	        		System.out.println("Unmatched Character in str1 : " + ch);
	        	}

	        }

	        for(int i=0;i<str2.length();i++)
	        {
	        	char ch = str2.charAt(i);
	        	if(str1.indexOf(ch) == -1)
	        	{
	        		System.out.println("Unmatahed Character in Str2 : " + ch);
	        	}
	        }
		
	}

}
