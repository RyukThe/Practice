package LogicalProgram;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String s= "Saurav";
		
		String rev="";
		 for(int i =s.length()-1;i>=0;i--)
		 {
			 rev = rev+s.charAt(i);
		 }
		 
		 System.out.println(rev);
		 
		 StringBuffer rev1= new StringBuffer(s);
		 rev1.reverse();
		 System.out.println(rev1);
		 
		 
		 StringBuilder rev11= new StringBuilder(s);
		 System.out.println(rev11.reverse());
		 
		
	}

}
