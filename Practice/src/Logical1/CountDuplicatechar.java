package Logical1;

public class CountDuplicatechar
{
	public static void main(String[] args)
	{
		String s="Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char space = s.charAt(i);
			if(space==' ')
			{
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
	}

}
