package study;

import java.io.*;
import java.util.ArrayList;
 public class CheckMain {
//	CheckMain s;
//	public void finalize() {
//		System.out.println("finalize");
//		s=this;
//	}
//	
//	public void checkGc() {
//		CheckMain obj=new CheckMain();
//		System.out.println(obj.hashCode());
//		obj=null;
//		System.gc();	
//		s=null;
//		System.gc();
//	}
	public static void main(String[] args)
	{
//		System.out.println("interface works");
//		System.out.println(Runtime.getRuntime().totalMemory());
//		System.out.println("Free memory -->"+Runtime.getRuntime().freeMemory());
//		CheckMain[] a=new CheckMain[500];
//		for(int i=0;i<500;i++)
//		{
//			a[i]=new CheckMain();
//		}
//		System.out.println("After creating object");
//		System.out.println("Free memory -->"+Runtime.getRuntime().freeMemory());
		
//		
//		ArrayList array=new ArrayList();
//		array.add("he");
//		array.add(1);
//		array.add(10);
//		array.add("hello");
//		array.add(10.0);
//		
//		for(var val:array)
//		{
//			System.out.println();
//		}
		try {
			
			Class.forName("study.autoLoad");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }

class autoLoad{
	static int n=10;
	static {
		System.out.println("auto load"+n);
	}
}

