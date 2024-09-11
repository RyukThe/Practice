package LogicalProgRamPractice;

public class ChnagesOccuranceofNumber {

	
	public static void main(String[] args) {
		String s="Hello my name is saurav";
		
		String[] sr = s.split(" ");
		
		for(int i=sr.length-1;i>=0;i--)
		{
			System.out.print(sr[i]+ " ");
		}
	}
}
