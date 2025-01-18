package useful;

import java.util.ArrayList;

public class Homework
{
	// Aggregation
	private ArrayList<Date> deadlines;

	public Homework()
	{
		this.deadlines = new ArrayList<Date>();
	}
	
	public Homework(ArrayList<Date> deadlines)
	{
		this.deadlines = deadlines;
	}

	public ArrayList<Date> getDeadlines()
	{
		return deadlines;
	}	
	
	public Date getDeadlines(int index)
	{
		return deadlines.get(index);
	}

	public void setDeadlines(int index, Date deadline)
	{
		this.deadlines.set(index, deadline);
	}
	
	public void addDeadline(Date deadline)
	{
		this.deadlines.add(deadline);
	}

	@Override
	public String toString()
	{
		return "Homework [deadlines=" + this.deadlines + "]";
	}
	
	// Test this class?
	
}
