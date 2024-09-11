package LogicalProgRamPractice;

public class CounNumberOfWords {

	public static void main(String[] args) {
		String s="Hello my Name is Saurav And Doing well";
		
		int count=1; // we have to calculate the number /length  not index and length or number is starts with 1.
		
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
		{
			count++;
		}
		
		
	}
	
	System.out.println(count);
	}
}
