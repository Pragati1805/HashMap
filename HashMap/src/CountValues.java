import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class CountValues
{
	HashMap<String,String> map=new HashMap<>();

	public HashMap<String,String> create()
	{
		map.put("Mr.X", "BJP");
		map.put("Mr.Y", "BJP");
		map.put("Mr.Z", "CONGRESS");
		map.put("Mr.L", "NCP");
		System.out.println(map);
		return map;
	}
	public void count(HashMap<String,String> m)
	{
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Collection<String> c=m.values();
		Iterator<String> itr=c.iterator();
				
		for(String s : c )
		{
				int val=map.getOrDefault(s, 0);
				map.put(s, val+1);
		}
		System.out.println(map);
			
	}
			
	

	public static void main(String[] args)
	{
		CountValues c=new CountValues();
		HashMap<String,String> m=c.create();
		c.count(m);
	}

}
