package study;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class ComparatorComparable implements Comparator{
	
	final  String a="hello";
	public static void main(String[] args) {
		final int n=10;
	
//	TreeMap<Integer,Integer> map=new TreeMap(new Comparator<V>() {
//
//		@Override
//		public int compare(V o1, V o2) {
//			if(o1>o2) {
//				return 1;
//			}
//			if(o1==02) {
//				return 0;
//				
//			}
//			else {
//				return -1;
//			}
//		}
//		
//	});
//	List<Map.Entry<Integer, Integer>> list=new ArrayList(map.entrySet());
//	Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
//		public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer, Integer>b) {
//			if(a.getValue()>b.getValue()) {
//				return -1;
//			}
//			else if(a.getValue()==b.getValue()) {
//				return 0;
//				
//			}
//			else {
//				return 1;
//			}
//		}
//	});
	List<Integer> list=new ArrayList();
	list.add(99);
	list.add(10);
	list.add(11);
	list.add(33);
	list.add(21);
	System.out.println(list);
	// sorting integers 
	Comparator<Integer> cmp=new Comparator<Integer>() { 
			@Override
			public int compare(Integer i, Integer j) {
				if(i%10 >j%10)
					return 1;
				else if(i%10==j%10)
				{
					if(i>j)
						return 1;		
				}
				return -1;
			}};
	// sorting class using compare
	Collections.sort(list,cmp);
	System.out.println(list);
	 
	//==========================================
	List<Student> std=new ArrayList<Student>();
	std.add(new Student(19,"naveen"));
	std.add(new Student(16,"abishek"));
	std.add(new Student(25,"lakshmi"));
	std.add(new Student(10,"pranov"));
	std.add(new Student(28,"mathi"));
	std.add(new Student(32,"abi"));
	Comparator<Student> student=new Comparator<Student>() {
		@Override
		public int compare(Student st1, Student st2) {
			if(st1.age<st2.age)
			{
				return 1;
			}
			return -1;
		}	
	};
	Collections.sort(std,student);
	System.out.println("sorting using comparator");
	for(Student s:std)
	{
		System.out.println(s.toString());
	}
	Collections.sort(std);
	System.out.println("Sorting using compareTo");
	for(Student s:std)
	{
		System.out.println(s.toString());
	}
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Student implements Comparable<Student>{
	int age;
	int id;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	// sorting by compareTo
	@Override
	public int compareTo(Student st) {
		if(this.age > st.age)
		{
			return 1;
		}
		else
			return -1;
	}
}

