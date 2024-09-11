package Logical1;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicate_ch 
{
	public static void main(String[] args)
	{
		String str="Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program";
		String [] ar=str.split(" ");
		
		HashMap<Character, Integer> mp= new HashMap<>();
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String word=ar[i];
			
			for(int j=0;j<=word.length()-1;j++)
			{
				char cha = word.charAt(j);
				
				if(mp.containsKey(cha))
				{
					mp.put(cha, cha+1);
				}
				else
				{
					mp.put(cha, 1);
				}
			}
		}
		
		
		Set<Character> key = mp.keySet();
		
		for(Character k:key)
		{
			System.out.println(k+ ": "+ mp.get(k));
		}
	}

}
