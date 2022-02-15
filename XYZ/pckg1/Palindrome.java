package pckg1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		int temp,sum=0,i;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		int n= c.nextInt();
		temp=n;
		while(n>0)
		{
			
			i=n%10;
			sum=(sum*10)+i;
			n=n/10;
			}
		
		if (temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("odd palindrome number");
		
		}
		
	}

}
