package pckg1;

public class classC {
	static int abc ; //Global Variable
	public void incre()
	{
		abc= abc+1;	
	}
	public static void main(String[] args) {
		System.out.println("First Object");
		classC obj=new classC();
		obj.incre();
		System.out.println(obj.abc);
		
		
		System.out.println("second Object");
		classC obj2=new classC();
		obj2.incre();
		System.out.println(obj2.abc);
		
		System.out.println("Third Object");
		classC obj3=new classC();
		obj3.incre();
		System.out.println(obj3.abc);
		
		
		
	}

}
