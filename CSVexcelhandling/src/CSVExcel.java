import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVExcel {
	
	public static void main(String[] args) throws IOException {
		File f= new File("../CSVexcelhandling/csvfile.csv");//connection establish
		FileReader fr= new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String data;
		while((data=b.readLine())!=null)

      System.out.println(data);
		{
			@SuppressWarnings("null")
			String[] S1 = data.split(",");
			for(int i=0;i<S1.length;i++)
			{
				System.out.println(S1[i]);
			}
			}
			
		}
			

		
	}


