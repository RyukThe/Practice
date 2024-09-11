package Practice_March25;

import java.util.HashMap;
import java.util.Set;

public class CountChar 
{
	public static void main(String[] args) 
	{
		String s="    Spelling mistakes or grammatical errors\r\n"
				+ "    Broken image links\r\n"
				+ "    Color inconsistencies in the website's design\r\n"
				+ "    Missing meta descriptions for web pages\r\n"
				+ "    Broken links in the website's footer\r\n"
				+ "    Typos in the instructions of a form\r\n"
				+ "    Missing alt tags on images\r\n"
				+ "    Broken hyperlinks in blog posts\r\n"
				+ "    Formatting issues in blog posts\r\n"
				+ "    Broken video links on web pages\r\n"
				+ "    Spacing issues in the website's footer\r\n"
				+ "    Missing or inaccurate contact information\r\n"
				+ "    Outdated copyright information\r\n"
				+ "    Broken social media links on the website\r\n"
				+ "    Poorly formatted email templates\r\n"
				+ "    Incorrect dates or times on the website\r\n"
				+ "    Missing or outdated FAQ pages\r\n"
				+ "    Incorrect page titles or descriptions\r\n"
				+ "    Broken search functionality on the website\r\n"
				+ "    Browser compatibility issues.";
		
		
		String []s1=s.split(" ");
		
		HashMap<Character, Integer> mp = new  HashMap<>();
		
		
		for(int i=0;i<=s1.length-1;i++)
		{
			String str=s1[i];
			
			for(int j=0;j<=str.length()-1;j++)
			{
				char ch=str.charAt(j);
				
				if(mp.containsKey(ch))
				{
					mp.put(ch, mp.get(ch)+1);
				}
				else
				{
					mp.put(ch, 1);
				}
			}
				
		
		}
		
		
		Set<Character> keys = mp.keySet();
		
		for(Character key:keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+" : "+ mp.get(key));
			}
		}
		
	}

}
