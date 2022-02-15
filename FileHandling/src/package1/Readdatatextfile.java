package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readdatatextfile {
	public static void main(String[] args) throws IOException {
		File f=new File("../FileHandling/readtdata.txt");//connection establish
		FileReader fr=new FileReader(f);//read character by character
		BufferedReader br=new BufferedReader(fr);//read character line by line
		//int a;
		//while ((a=fr.read())!=-1)//in case of read character by character
		String s;
		while ((s=br.readLine())!=null)
		
			
		{
			System.out.println(s);
		}
		
		
	}

}
