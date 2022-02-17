import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritecsvExcelfile {
	public static void main(String[] args) throws IOException {
		
		File f= new File("../CSVexcelhandling/csvwrite1.csv");
		FileWriter fw =new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++);
			{
			b.write("Ashutosh");
			b.write(",");
			}
			b.newLine();
		}
		b.close();
}

}