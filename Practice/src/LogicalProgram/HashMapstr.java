package LogicalProgram;

import java.util.HashMap;
import java.util.Set;

public class HashMapstr 
{
	public static void main(String[] args) 
	{
		String m= "James Ashley was killed in a police raid in the English town of St Leonards-on-Sea, East Sussex, on 15 January 1998. An inquiry found that using armed officers breached guidelines, the raid team was inadequately trained, and officers in charge misrepresented intelligence to gain raid authorisation. A second inquiry accused chief officers of colluding to obstruct the first inquiry. The officer who shot Ashley was charged with murder but acquitted on the grounds of self-defence. The officers who led the operation, charged with misconduct in public office, were also acquitted. Ashley's family sued the police for negligence and battery; the case was heard by the House of Lords who ruled that the threshold for pleading self-defence in a civil case was higher than in a criminal one and that the litigants should decide which causes of action to pursue. Ashley's death was considered in a report that recommended stronger control of armed operations and equipping officers with non-lethal alternatives.";
		
		String[] str = m.split(" ");
		HashMap<String, Integer> mp= new HashMap<String, Integer>();
		
		for(int i=0;i<=str.length-1;i++)
		{
			String strd = str[i];
			
			if(mp.containsKey(strd))
			{
				mp.put(strd, mp.get(strd)+1);
			}
			else
			{
				mp.put(strd, 1);
			}
		}
		
		
		Set<String> sd = mp.keySet();
		
		for(String k:sd)
		{
			if(mp.get(k)>1)
			{
				System.out.println(k+ " : " + mp.get(k));
			}
		}
	}

}
