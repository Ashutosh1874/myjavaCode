package pckg1;

public class xyz extends abc
{
	public xyz()
	{
		this(1,2);
	System.out.println("child default constructor");	
	}
	public xyz(int a)
	{
		this(1,2,3);
	System.out.println("child one parameterized constructor");	
	}
	public xyz(int a ,int b)
	{
		super(1,2);
	System.out.println("child two parameterized constructor");	
	}
	public xyz(int a ,int b,int c)
	{
		this();
	System.out.println("child three parameterized constructor");	
	}
	public static void main(String[] args) {
		xyz obj= new xyz();
	}

	}
	
