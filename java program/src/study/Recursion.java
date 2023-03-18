package study;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

public class Recursion implements Closeable{

//	  void print(){
//	    System.out.println("Test print");
//	  }
//
//	  
//	  @Override
//	  public void close() {
//	    System.out.println("Closing resources");
//	  }
	static int i=1;
	  
	  protected void finalize()
	  {
		  int num=1;
		  System.out.println("working"+1);
		  System.out.println(10/0);
		  num=num+1;
	  }
	  public static void main(String[] args) {

		  System.out.println(Runtime.getRuntime().totalMemory());
		  System.out.println("free memory"+Runtime.getRuntime().freeMemory());
	    Recursion closeableExample = new Recursion();
	    
	    Map<Character,Integer> map=new HashMap();
	    map.put('a', null);
	    map.put('b', null);
	    for(Map.Entry m:map.entrySet())
	    {
	    	System.out.println(m.getKey());
	    	System.out.println(m.getValue());
	    }
	    Recursion[] a=new Recursion[2000];
	    
//	    for(int i=0;i<10;i++)// for checking object space;
//	    {
//	    	a[i]=new Recursion();
//	    }
//	    
//	    for(int i=0;i<10;i++)
//	    {
//	    	a[i]=null;
//	    	System.gc();
//	    }
	    
//====================for checking permanent space==============
	    
	    
	    System.out.println(Runtime.getRuntime().totalMemory());
	    System.out.println("free memory"+Runtime.getRuntime().freeMemory());

	  }
	 
	  

	 
	@Override
	  public void close() {
	    System.out.println("Closing resources");
	  }

//	  public static void main(String[] args) {
//
//	    try(Recursion closeableExample = new Recursion()) {
//	      closeableExample.print();
//	    }
//	    catch (Exception e){
//	      e.printStackTrace();
//	    }
//
//	  }

}
