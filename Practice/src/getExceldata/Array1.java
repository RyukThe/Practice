package getExceldata;

public class Array1 
{
	public static void main(String[] args) 
	{
		String s[][]= {{"Saurav","Rahul","harsh"},{"Saurav ","harsh ","heloo"}};
		int row = s.length;
		System.out.println(row);
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i=row-1;i>=0;i--)
		{
			for(int j=2;j>=0;j--)
			{
					String jk = (s[i][j]);
//				StringBuffer st=new StringBuffer(jk);
//						System.out.print(st.reverse()+ " ");
					String rev = rev(jk);
					System.out.print(rev + " ");
				
			}
			System.out.println();
		}
		
		
	String rev = rev("Saurav");
	System.out.println(rev);
		
	}
		
		
	


	
	
	public static String rev(String s)
	{
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		
		return reverse;
		
	}
}
