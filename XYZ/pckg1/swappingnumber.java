package pckg1;

import java.util.Scanner;

public class swappingnumber {
public static void main(String[] args) {
	
System.out.println("Please enter valuew of a, b");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		 a = a+b;
		 b = a-b;
		 a= a- b;
		 
		System.out.println("after the swapping a= "  +a);
		System.out.println("after the swapping  b= "   +b);
					  
	}
	
	
	
}
