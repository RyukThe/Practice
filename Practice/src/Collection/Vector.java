package Collection;

import java.util.Enumeration;

public class Vector 
{
	public static void main(String[] args) {
		java.util.Vector v= new java.util.Vector();
		v.add("Saurav:");
		v.add(null);
		v.add(1542);
		v.add("Saurav:");
		v.add('c');
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.contains("Saurav:"));
		System.out.println(v.get(0));
		
		Enumeration m = v.elements();
		while(m.hasMoreElements())
		{
			System.out.println(m.nextElement());
		}
	}

}
