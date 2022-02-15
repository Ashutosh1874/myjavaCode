package pckg1;
//methood overriding/dynamic/runtime
public class classY extends classX{
	
	public void arithemetic(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Result of " +c);
		super.arithemetic(15, 25);
		
	}
	
	public static void main(String[] args) {
		
		classY obj= new classY();
		obj.arithemetic(10, 20);
		
	}

}
