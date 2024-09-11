package Collection;

import java.util.Iterator;

public class TreeSet 
{

	public static void main(String[] args) {
		
		java.util.TreeSet t= new java.util.TreeSet();
		t.add("Saurav");
		//t.add(1236);
		t.add("Amol");
		
		
		Iterator it=t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(t.first());
		
		System.out.println(t.last());
		t.pollFirst();
		t.pollLast();
		
		System.out.println(t.isEmpty());
		
	}
}
