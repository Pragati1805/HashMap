import java.util.HashMap;

public class OccuranceMap
{
	public void countChar(String str)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(Character c : str.toCharArray())
		{
			/*if(map.containsKey(c))
			{
				//int val=map.get((c)+1);
				map.put(c, map.get((c)+1));
			}
			else
				map.put(c, 1);*/
			
			int val=map.getOrDefault(c,0);
			map.put(c, val+1);
		
		}
		System.out.println(" Occurance of each caharcter in given String is : \n"+map);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		OccuranceMap o=new OccuranceMap();
		o.countChar("THINK QUOTIENT");
	}

}
