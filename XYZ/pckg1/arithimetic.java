package pckg1;
///Polymorphism--overloading//
public class arithimetic {
	
	public void sum(int a, int b)
	
	{
		int c=a+b;
		System.out.println("Result of " + c);
	}
public void sum(int a,int b, int c)
{
	int d;
	d= a+b+c;
	System.out.println("Result of " + d);
}
public static void main(String[] args) {
	arithimetic obj = new arithimetic();
	obj.sum(10, 20);
	obj.sum(15,20, 25);
	
}
}
