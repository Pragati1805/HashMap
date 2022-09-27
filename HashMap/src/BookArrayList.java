
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BookArrayList
{
	LinkedList<Book> al=new LinkedList<Book>();
	TreeMap<Integer,String> map;
	public void create()
	{
		al.add(new Book(121,202,"XYZ","A.B.Ambedkar",(new Author(11,"Ambedkar"))));
		al.add(new Book(123,300,"LMN","S.L.Lohar",(new Author(12,"Gawade"))));
		al.add(new Book(122,400,"LLL","N.L.Podar",(new Author(13,"Khilari"))));
		System.out.println(al);
	}
	public void show()
	{
		//Author a=new Author(); 
		map=new TreeMap<Integer,String>(Collections.reverseOrder());
			for(Book b : al)
			{
				map.put(b.bid,b.a.aname);
			}
			
			System.out.println("Descending Order Map: \n"+map);	
				
		
	}
	public void byLinkedHashMap()
	{
		LinkedHashMap<Integer,String> map1=new LinkedHashMap<>(map);
		//Set<Entry<Integer,String>> set=map.entrySet();
//		Iterator<Entry<Integer,String>> itr=set.iterator();
//		while(itr.hasNext())
//		{
//			Entry<Integer,String> entry=itr.next();
		System.out.println("Order of insertion maintained");
			System.out.println(map1);
//		}
	}
	public static void main(String[] args) 
	{
		BookArrayList ba=new BookArrayList();
		ba.create();
		ba.show();
		ba.byLinkedHashMap();
		
	}

}
