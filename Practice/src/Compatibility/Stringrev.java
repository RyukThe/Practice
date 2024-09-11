package Compatibility;

public class Stringrev
{
	public static void main(String[] args) 
	{
		String d="Java JavaSrciptExecutor Selenium";
		
/*		int count=0;
		for(int i=d.length()-1;i>=0;i--)
		{
			char ch = d.charAt(i);
			if(ch==' ')
			{
				count++;
			}
	
			
			
			
		}
	//	System.out.println(d.replace(" ", ""));
		System.err.println(count);
		
		
	
		String rev="";
		for(int i=d.length()-1;i>=0;i--)
		{
		
			rev=rev+d.charAt(i);
		}
		System.out.println(rev);
		*/
		
		String[] sd = d.split(" ");
		System.out.println(sd.length);
		
		String rev2="";
		for(int i=sd.length-1;i>=0;i--)
		{
			String str = sd[i];
			//System.out.println(str);
			
			for(int j=str.length()-1;j>=0;j--)
			{
			rev2=rev2+str.charAt(j);

			}
			
			
			
		}
		
		System.out.println(rev2);
		
	}

}
