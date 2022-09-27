import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BookMap

{
	HashMap<String,Book> map;
	
	/*public HashMap<String,Book> create()
	{
		
		map=new HashMap<String,Book>();
		map.put("P.L.Deshpande",(new Book(100,500,"Java","jhbxud")));
		map.put("s.m.mahadik",(new Book(101,1000,"c","xjdwku")));
		map.put("P.D.Gawade",(new Book(102,1500,"python","jhsghdxu")));
		map.put("A.K.Palande",(new Book(100,200,"maths","jhxdbuc")));
		
		return map;
	}*/
	public void show()
	{
		System.out.println("***********************Entries are :************************");
		Set<Entry<String,Book>> entries=map.entrySet();
		System.out.println(entries);
		System.out.println("_____________________________________");
		
		Iterator<Entry<String,Book>> itr=entries.iterator();
		
		while(itr.hasNext())
		{
			Entry<String,Book> entry=itr.next();
			System.out.println(entry);
		}
				
	}

	
}
