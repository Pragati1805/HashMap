import java.util.HashMap;

public class Book 
{
	String bname;
	int bid;
	float cost;
	Author a;
	Book()
	{}
	Book(int i,float c,String n,String b,Author au)
	{
		bid=i;cost= c;bname=n;
		a=au;
	}
	public String toString()
	{
		return "Book id= "+bid+ " book cost = "+cost + " book name = "+bname+
				 " author details : "+a;
	}
	
	
}
