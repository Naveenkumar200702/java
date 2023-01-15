package assignment;
import java.util.*;
public class ArrayList{
	Scanner sc=new Scanner(System.in);
	int array[]=new int[5];
	int cid=0;
    void add(){
		System.out.println("enter an element to add");
		int element=sc.nextInt();
		if(cid<=array.length-1)
		{
			array[cid++]=element;
			System.out.println("element added");
			
		}
		else
		{
			int[] temp=array.clone();
			array=new int[temp.length+5];
			for(int i=0;i<temp.length;i++)
			{
				array[i]=temp[i];
			}
			array[cid++]=element;
			System.out.println("element added");
		}
		System.out.println("------");
	index();
		
	}
	void delete()
	{
		if(cid<1)
		{
			System.out.println("Array is empty");
			index();
		}
		array[--cid]=0;
		System.out.println("element deleted");
		System.out.println("------");
		index();
	}
	void printarray()
	{	
		System.out.println("elements");
		System.out.println(Arrays.toString(array));
		System.out.println("---------");
		index();
	}
	
boolean index(){
	System.out.println("enter the operation");
	System.out.println("1 Add element");
	System.out.println("2 delete element");
	System.out.println("3 print array");
	System.out.println("4 exit");
	int option=sc.nextInt();
	switch (option){
		case 1:
			add();
			break;
		case 2:
			delete();
			break;
		case 3:
			printarray();
			break;
		case 4:
			System.out.println("exit successfully");
			return false;
		default:
			System.out.println("enter an valid input");
			index();
	}
	return false;
	}
	public static void main(String[] args)
	{
		boolean check=true;
		Scanner sc=new Scanner(System.in);
		ArrayList obj=new ArrayList();
		while(check)
		{	
			check=obj.index();
		}
	}
}

