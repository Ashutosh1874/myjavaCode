package pckg1;

import java.util.Scanner;

public class conditionexample {
	public static void main(String[] args) {
		System.out.println("Please enter value of a");
		Scanner s= new Scanner (System.in);
		int a =s.nextInt();
		if(a%2==0) {
			System.out.println("Even number");
		}
			
		else
		{
			System.out.println("Odd number");
		}
		
			
		
	}

}
