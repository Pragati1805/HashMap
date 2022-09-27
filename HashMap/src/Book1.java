public class Book1 
{
	String bname;
	int bid;
	int cost;
	
	Book1()
	{}
	Book1(int i,int c,String n)
	{
		bid=i;cost= c;bname=n;
		
	}
	public String toString()
	{
		return "Book id= "+bid+ " book cost = "+cost + " book name = "+bname;
				
	}
	
	
}
