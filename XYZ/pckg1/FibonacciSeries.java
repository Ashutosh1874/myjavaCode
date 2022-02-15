package pckg1;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0,b=1,i,sum,count=10;
	System.out.println("Please enter FibonacciSeries number");
	 Scanner c= new Scanner(System.in);
	 int s= c.nextInt();
	 System.out.println("FibonacciSeries number");
	 for (i=1;i<=count;i++)
	 {	
		 sum= a+b;
		 a=b;
		 b=sum;
		 System.out.println("Please print the value of "  +sum);
		 
	 }
	 
	 
	
	
	}

}
