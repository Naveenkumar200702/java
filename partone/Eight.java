import java.util.*;
public class Eight{
	
	
	static int a=2;
	static int c=9;
	
	int rec()
	{
		int b=5;
		b++;
		return b;
	}
	static int rec1()
	{
		
		return ++c;
	}
			
		
	public static void main(String[] args)
	{
		Eight obj=new Eight();
		System.out.println(a);//static variable can be acessed inside static function
		System.out.println("non static value " +obj.rec());//non static function need object 
		System.out.println("non static value "+obj.rec());
		System.out.println("static value "+ rec1());//static function does not need object	
		System.out.println("static value "+ rec1());	
		
	}
}