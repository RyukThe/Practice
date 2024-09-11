package LogicalProgram;

public class CountSpaces 
{

	public static void main(String[] args)
	{
		String s="Sad ds ds ds d s d sd  ";
		int count=0;
		for(int i =0;i<=s.length()-1;i++)
		{
			char space = s.charAt(i);
			if( space==' ')
			{
				count++;
			}
		}
		
		
		System.out.println(count);
	}
}
