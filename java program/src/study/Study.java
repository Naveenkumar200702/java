package study;
abstract class GrantParent{
	abstract void add();
	//abstract void sub();
}
abstract class Parent extends GrantParent{
	
	void print()
	{
		
		System.out.println("hello");
	}
}
public class Study extends Parent{
	void add()
	{
		System.out.println("add");
	}
	public static void main(String[] args)
	{
		new Study().add();
		new Study().print();
	}

}
