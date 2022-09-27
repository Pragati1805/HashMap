import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample
{
	HashMap<String,Integer> map;
	public void accept()
	{
		map=new HashMap<String,Integer>();
		map.put("Pune", 10);
		map.put("Mumbai", 20);
		map.put("Delhi",50);		//does not maintain order of insertion 
		map.put("Delhi",157);
		
		System.out.println(map);
		System.out.println("Size of map :" +map.size());
		Integer a=map.get("Dubai");
		System.out.println(map.get(a));
		System.out.println("get function : "+map.get("pune"));
		System.out.println(map.getOrDefault(a,0));
		
	}
	public void entrySet()
	{
		System.out.println("Entries Are :");
		Set<Entry<String,Integer>> entries= map.entrySet();
		System.out.println(entries);
		
		System.out.println("_______________________________---");
		
		Iterator<Entry<String,Integer>> itr=entries.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> entry=itr.next();
			System.out.println(entry);
		}
	}
	public static void main(String[] args)
	{
		HashmapExample h=new HashmapExample();
		h.accept();
		h.entrySet();
	}

}
