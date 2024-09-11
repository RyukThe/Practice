package LogicalProgRamPractice;

public class FindUnMatchingCharchteraproch_1 {

	
	public static void main(String[] args) {
		
		String s="hello my name is Garmak";
		String s1="Kello hy mane ok Sayrak";
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i); 
			
			if(s1.indexOf(ch)==-1)// compare charter is not matched then return true
			{
				System.out.print( ch);
			}
		}
	
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			
			if(s.indexOf(ch)==-1)
			{
				System.out.print( ch);
			}
		}
		
		
	}
}
