package pckg;

//constructor like method
//constructor name and class name always be same
//no return type
//no need to call,it will call automatically
//two types of constructor--default and parameterized

public class student {
	public student() //its indicate method
	
	{
		this (1,2,3);
		System.out.println("Default constructor");	
	}
	
public student(int a) 
	
	{
		System.out.println("One  parameterized constructor");	
	}
public student(int a, int b) 
	
	{
	
		System.out.println("Two  parameterized constructor");	
	}
public student(int a, int b, int c) 
	
	{
	
	    
		System.out.println("Three  parameterized constructor");	
	}

public student(int a, int b, int c,int d) //its indicate method

{
	System.out.println("Four  parameterized constructor");	
}
public static void main(String[] args) 
{
	student Ashu = new student();//Three  parameterized constructor
	student XYZ = new student(1,2,3,4);
	student ABC = new student(1);
	student XY = new student(1,2);
	
	
}






}
