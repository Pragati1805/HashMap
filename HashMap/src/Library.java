import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Library 
{
	public void showAuthor(HashMap<String,Book> m)
	{
		System.out.println("*************************Authors are : *******************");
		Set<String> set=m.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
 	}
	public void showBooks(HashMap<String,Book> m)
	{
		System.out.println("***************Books Details are *************");
		Collection<Book> collection= m.values();			//values(_) return type is collection
		Iterator<Book> itr=collection.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
	public static void main(String[] args) 
	{
		BookMap b=new BookMap();
	//HashMap<String,Book> map=b.create();
		b.show();
		Library l=new Library();
		//l.showAuthor(map);
		//l.showBooks(map);

	}

}
