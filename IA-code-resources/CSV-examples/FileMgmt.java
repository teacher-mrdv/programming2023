import java.util.*;
import java.io.*;

public class FileMgmt
{

    public static ArrayList<Double> nums = new ArrayList<>();

    public static void save() throws IOException
    {
        System.out.println("<<< Saving data >>>");
        File file = new File("testdata.csv");
        FileWriter fw = new FileWriter(file);
        PrintWriter out = new PrintWriter(fw);	// write mode
        //out.println("Data"); // CSV heading
        for (int i = 0; i < nums.size(); i++)  //loop to save each element ->
        {
            out.println(nums.get(i));
        }
        out.close();
        System.out.println("Data file saved."); // optional
    }
    
	public static void load() throws IOException
	{
		nums.clear();
		File file = new File("testdata.csv");
		FileReader fr = new FileReader(file);
		BufferedReader read = new BufferedReader(fr);
		String line = "";
		while( read.ready() )
		{
			line = read.readLine();
			double data = Double.parseDouble(line);
			nums.add(data);
		}
		read.close();
	}
	
	public static void main (String[] args) throws IOException 
	{
		File file = new File("testdata.csv");
		if(file.exists())
		{   load();
                    System.out.println(nums);
		}
		double x = Math.random()*256 +1;
                System.out.println(x);
                nums.add(x);
                save();
		
	}
}

