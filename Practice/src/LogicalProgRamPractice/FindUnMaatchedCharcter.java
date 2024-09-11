package LogicalProgRamPractice;

import java.util.ArrayList;

import com.graphbuilder.struc.LinkedList;

public class FindUnMaatchedCharcter {

	public static void main(String[] args) {
		
		
		String s= "Hello ol kasmk kf";
		String  s1="lkfiwo kdmds klsd";
		
		
		if(s.equals(s1))
		{
			System.out.println("is matching string");
		}
		else
		{
			ArrayList<Character> unm=new ArrayList<Character>();
			ArrayList<Character>unm1= new ArrayList<Character>();
			
			
			for(Character ch:s.toCharArray())
			{
				unm.add(ch);
			}
			for(Character ch:s1.toCharArray())
			{
				unm1.add(ch);
			}
			
			for(Character ch:s1.toCharArray())
			{
				unm.remove(ch);
			}
			for(Character ch:s.toCharArray())
			{
				unm1.remove(ch);
			}
			
			System.out.println(unm);
			System.out.println(unm1);
		}
	}

}
