package pckg1;

public class classA 
{
	public void method1()
	{
		System.out.println("parent1 method");
	}
	public void method2()
	{
		System.out.println("parent2 method");
	}
	public void method3()
	{
		System.out.println("parent3 method");
	}
	public void method4()
	{
		System.out.println("parent4 method");
	}
	public static void main(String[] args) {
		classA obj = new classA();
		obj.method1();
		
	}
}

