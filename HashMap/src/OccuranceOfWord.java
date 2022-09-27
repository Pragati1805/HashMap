import java.util.HashMap;

public class OccuranceOfWord
{
	public void showOccur(String str)
	{
		HashMap<String,Integer> m=new HashMap<>();
		
		for(String s : str.split(" "))
		{
			if(m.containsKey(s))
			{
					m.put(s, m.get(s)+1);
			}
			else
				m.put(s,1);
		}
		System.out.println("Occurance of String is \n"+m);
	}
	public static void main(String[] args) 
	{
		OccuranceOfWord o=new OccuranceOfWord();
		o.showOccur("Java Is Interesting Java Is Easy");
		
	}

}
