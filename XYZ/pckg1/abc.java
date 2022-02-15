package pckg1;

public class abc
{
 public abc() {
	 
	System.out.println("parent default counstructor");  	 
}
 public abc(int a)
 {
	 this(1,2,3);
		System.out.println("parent one parameterized counstructor"); 
	}
 public abc(int a,int b)
 {
	 
System.out.println("parent two parameterized counstructor"); 
}
 public abc(int a,int b, int c)
 {
	
System.out.println("parent three parameterized counstructor"); 
}
 public static void main(String[] args) {
	 
	 abc obj = new abc();
}
 
 
 
 
 
 
}
