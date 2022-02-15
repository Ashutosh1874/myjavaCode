package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class editdatatextfile {
	public static void main(String[] args) throws IOException {
		File f = new File("../FileHandling/src/package1/edittdatatest.txt");//establish connection
		FileWriter fw = new FileWriter(f);// to write any data in text file.
		fw.write("I am Ashutosh & i am QA professional");
		fw.close();//for saving and closing the file.
		
		
		
		
		
		
		
	}

}
