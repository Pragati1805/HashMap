import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BookHashmap 
{
	HashMap<Book1,String> map=new HashMap<>();
	public void create()
	{
		map.put(new Book1(10,500,"Java"), "Pragati");
		map.put(new Book1(11,1500,"c"), "Adesh");
		map.put(new Book1(12,1000,"python"), "Sonal");
		map.put(new Book1(10,500,"java"), "Abhi");
		System.out.println(map);

	}
	public void iterate()
	{
		System.out.println("*************** Iterating Entries are ********************");
		Set<Entry<Book1,String>> entries=map.entrySet();
		Iterator<Entry<Book1,String>> itr=entries.iterator();
		while(itr.hasNext())
		{
			Entry<Book1,String> entry=itr.next();
			System.out.println(entry);
		}
			
			
	}
	public static void main(String[] args)
	{
		BookHashmap b=new BookHashmap();
		b.create();
		b.iterate();

	}

}
