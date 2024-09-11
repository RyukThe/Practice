package Practice_March25;

import java.util.HashMap;
import java.util.Set;

public class HashMap_1 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "Hello");
		mp.put(2, "Saurav");
		mp.put(null, null);
		mp.put(null,"Saurav1");
		System.out.println(mp.containsValue("Saurav"));
		
		Set<Integer> keys = mp.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+"- "+ mp.get(key));
		}
		
		
		
	}

}
