package study;

public class Study{
	static class Study1{
		void add()
		{
			System.out.println("works");
		}
	}
	class Child extends Study1{
		
		void add()
		{
			System.out.println("child works");
		}
		
	}	
	public static void main(String[] args)
	{
		//Child object=new Child();

	
	}
}



