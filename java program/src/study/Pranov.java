package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.*;

public class Pranov {
	String name = "naveen";
	
 
	public static void main(String[] args) throws Exception {
		// Pranov obj=new a();
		// a obj=new a();
		// obj.print();
		//final int n;
		
//		a obj=new a() {
//			void print() {
//				System.out.println("works");
//			}		
//		};
//		synchronized(Pranov.class) {
//			
//		}

//		
//		//System.exit(0);
//		Integer a=10;
//		Integer b=10;
//		String s="hekki";
//		System.out.println(a==b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		Class cls=obj.getClass();
//		System.out.println(cls.getName());
////		Constructor cr=cls.getConstructor();
//		Field fld=cls.getDeclaredField("str");
//		fld.set(obj, "naveen");
//		fld.setAccessible(true);
//		fld.set(obj, "naveen");
//		System.out.println(obj.str);
//		
//		a obj=new a();
//		a.small.print();
//		Thread t=new Thread(new Runnable() {
//			public void run()
//			{
//				System.out.println("works");
//			}
//		});
//		Runnable runnable = () -> System.out.println("Hello");
////		System.out.println(t.getName());
////		t.start();
		
//		Pranov obj1=new Pranov();
//		System.out.println(obj1.getClass().getName());
//		System.out.println(obj.getClass().getName());
//		System.out.println(object.getClass().getName());
//		System.out.println(object1.getClass().getName());
//		System.out.println(object2.getClass().getName());
//		object1.print();
//		System.out.println(object1.n);
		object2.print();
		System.out.println(object2.n);
		
		
		
		

	}
//	static hello obj=new hello() {
//		public void show() {
//			System.out.println("works");
//		}
//	};
//	static abi object=new abi() {
//		public void show() {
//			System.out.println("abi class");
//		}
//	};
	
	static abirami object2=new abirami() {
		
	};
	

	
}
abstract class abirami{
	protected int n=10;
	void print() {
		System.out.println("hello abi");
	}
}
interface abi{
	void show();
}
interface hello {
	 void show();
}

// class a{
//	 static class small {
//		public static void print() {
//			//System.out.println("works");
//		}
//	}
//}


