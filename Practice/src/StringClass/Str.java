package StringClass;

public class Str
{
	public static void main(String[] args) 
	{
		String s1="my name is Saurav";
		String s2="My name is Saurav";
		String s3 ="";
		
		System.out.println(s1.contains("n"));
		
		System.err.println(s2.startsWith("My"));
		System.err.println(s2.endsWith("Saurav"));
		System.err.println(s2.charAt(0));
		System.err.println(s2.indexOf('m'));
		System.err.println(s2.lastIndexOf('s'));
		System.err.println(s2.replace("Saurav", "Gaurav"));
		System.err.println(s2.substring(3));
		System.err.println(s2.substring(3,9));
		System.err.println(s2.concat(s1));
		
		String ar[]=s1.split(" ");
		for(String s1s:ar)
		{
			System.out.println(s1s);
		}
	}

}
