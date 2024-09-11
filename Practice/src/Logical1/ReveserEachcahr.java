package Logical1;

public class ReveserEachcahr 
{
	public static void main(String[] args) 
	{
		String l="Apache Log4j2 versions 2.0-beta7 through 2.17.0 (excluding security fix releases 2.3.2 and 2.12.4) are vulnerable to a remote code execution (RCE) attack where an attacker with permission to modify the logging configuration file can construct a malicious configuration using a JDBC Appender with a data source referencing a JNDI URI which can execute remote code. This issue is fixed by limiting JNDI data source names to the java protocol in Log4j2 versions 2.17.1, 2.12.4, and 2.3.2.";
		String [] str=l.split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			String wor=str[i];
			String rev="";
			for(int j=wor.length()-1;j>=0;j--)
			{
				rev=rev+wor.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
		
		System.out.println();
		
		
		for(int i=str.length-1;i>=0;i--)
		{
			String k=str[i];
			String rev="";
			for(int j=k.length()-1;j>=0;j--)
			{
				rev=rev+k.charAt(j);
			}
			System.out.print(rev+ " ");
		}
		
	}

}
