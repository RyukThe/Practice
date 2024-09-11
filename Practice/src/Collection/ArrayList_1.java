package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_1 
{
	public static void main(String[] args)
	{
		ArrayList m= new ArrayList();
		m.add("Saurav");
		m.add(105);
		m.add('A');
		m.add(true);
		m.add(null);
		m.add("Saurav");
		System.out.println(m.size());
		System.out.println(m.contains("Saurav"));
		System.out.println(m.isEmpty());

		System.out.println(m);
		m.add(0, "Hello");
		System.out.println(m);
		m.remove(0);
		System.out.println(m);
		m.set(0, "My name is Saurav");
		System.out.println(m.get(1));
		System.out.println(m);
		
		Iterator itr = m.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		ListIterator lis=m.listIterator();
		while(lis.hasNext())
		{
			System.out.println(lis.next());
		}
		
		for(int i=0;i<=m.size()-1;i++)
		{
			System.out.println(m.get(i));
		}
			
		
	}

}
