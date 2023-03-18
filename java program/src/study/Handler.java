package study;

import java.io.IOException;

class GrandParent{
	GrandParent(){
		System.out.println(this.hashCode());
	}
}
class Parent extends GrandParent{
	Parent(){
		
		System.out.println(this.hashCode());
	}
}
class Child extends Parent{
	Child(){
		System.out.println(this.hashCode());
	}
}
public class Handler {
	
	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println(c.hashCode());
	}
	
	
		
	}
