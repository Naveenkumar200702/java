package study;
public class InterfaceExample{
	public static void main(String[] args)
	{
		
		//new InterfaceExample().print();
		System.out.println(new InterfaceExample().a);
		
	}
//	void print()throws ArithmeticException
//	{
//		System.out.println("child");
//	}
	int a=0;
	
	static {
		System.out.println("hello World"+new InterfaceExample().a);
		//System.exit(1);
	}
	{
		a=10;
	}
}
