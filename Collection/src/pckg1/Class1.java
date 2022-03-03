package pckg1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class1 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer>hs= new LinkedHashSet<Integer>();
		hs.add(122);
		hs.add(454);
		hs.add(322);
		hs.add(1);
		hs.add(23456);
		hs.add(67000);
		for (Integer i: hs)
		{
		System.out.println( i );
		
		}
		
	}

}
