package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HashSet
{
	public static void main(String[] args) {
		
		java.util.HashSet m= new java.util.HashSet();
		m.add("Saurav");
		m.add('c');
		m.add(null);
		m.add(null);
		m.add(5);
		m.add(5.6f);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.contains("Saurav"));
		
		m.remove('c');
		System.out.println(m);
	
		Iterator sad = m.iterator();
		while(sad.hasNext()) {
			System.out.println(sad.next());
		}
		
		ArrayList<Integer> m1= new ArrayList<Integer>();
		
		
		
		
		
		
		
	}

}
