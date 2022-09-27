
public class Author 
{
	String aname;
	int aid;
	Author()
	{
		
	}
	Author(int i,String n)
	{
		aid=i;aname=n;
	}
	public String toString()
	{
		return "Author Id="+aid+ "  author name= "+aname;
	}
}
