package pckg1;

public class classB extends classA
{
public void method1()
{
	
	System.out.println("child1 method");
}
public void method2()
{
	System.out.println("child2 method");
}
public void method3()
{
	this.method4();
	System.out.println("child3 method");
}
public void method4()
{
	System.out.println("child4 method");
	super.method1();
	super.method2();
}
public static void main(String[] args) {
	classB obj= new classB();
	obj.method3();
	
}
}
