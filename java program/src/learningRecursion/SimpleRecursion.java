package learningRecursion;

public class SimpleRecursion {
	static void print(String name,int n)
	{
		if(n==6)
			return;
		System.out.println(name);
		print(name,n+1);
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		print("Naveen",1);
	}
}
