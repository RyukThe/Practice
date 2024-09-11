package April24;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseOnlyString {
	
	
	public static void main(String[] args) {
		
	
	
	
	String s= "Sae47845kare";
	
			char[] chare = s.toCharArray();	
			
			for(int i=0;i<=chare.length-1;i++)
			{
				char ch=chare[i];
				if(Character.isAlphabetic(ch))
				{
					String s1=s+ch;
					
				}
				else
				{
					
				}
			}
	
	}
	
	

}
