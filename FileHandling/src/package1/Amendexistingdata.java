package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Amendexistingdata {
	
	public static void main(String[] args) throws IOException {
    File f= new File("../FileHandling/src/package1/Amendexistingdata.txt");//connection establish
    FileWriter fw = new FileWriter(f, true);
    BufferedWriter b = new BufferedWriter(fw);
    b.write("Ashutosh kumar");
    b.newLine();
    b.write("BE-Computer");
    b.newLine();
    b.close();
    
		
		
		
		
		
		
	}

}
