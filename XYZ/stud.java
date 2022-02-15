package pckg;

public class stud {
	
	
	public void X1()
	{
		System.out.println("default parameterized");
	}
	public void X2(int a)
	{
		System.out.println("one parameterized");
	}
	public void X3(int a,int b)
	{
		this.X4(1,2,3);
		this.X5(10, 20, 20, 40);
		this.X1();
		this.X2(100);
		
		System.out.println("two parameterized");
	}
	public void X4(int a,int b,int c)
	{
		
		System.out.println("three parameterized");
	}
	public void X5(int a,int b,int c,int d)
	{
		System.out.println("four parameterized");
	}
	
	public static void main(String[] args) {
		
		stud obj = new stud();
		obj.X3(1,2);
		
		
	}
	
}
