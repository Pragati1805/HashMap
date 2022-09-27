import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OccuranceArrayList 
{
	ArrayList<String> al=new ArrayList<>();

	public void checkOccur()
	{
		al.add("Pune");
		al.add("Mumbai");
		al.add("Sangali");
		al.add("Mumbai");
		al.add("Pune");
		System.out.println("ArrayList \n"+al);
				
	}
	public void occurance()
	{
		HashMap<String,Integer> m=new HashMap<>();
		for(String s : al )
		{
			if(m.containsKey(s))
			{
			m.put(s, m.get(s)+1);
			}
		else
			m.put(s, 1);
		}
		System.out.println("Occurance of ArrayList is : "+m);
	}
	public static void main(String[] args) 
	{
		
		OccuranceArrayList o=new OccuranceArrayList();
		o.checkOccur();
		o.occurance();
	}

}
