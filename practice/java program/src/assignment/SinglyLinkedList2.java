package assignment;
class LinkedList2{
	int size=0;
	class Node{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	Node head;
	Node tail;
	LinkedList2(){
		head=null;
		tail=null;
	}
	public void atFirst(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else {
			Node temp=head;
			head=newNode;
			head.next=temp;
		}	
		size++;
	}
	public void atLast(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node temp=tail;
			tail=newNode;
			temp.next=tail;
		}
		size++;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void insert(int pos,int val)
	{
		if(pos==0)
		{
			atFirst(val);
			return;
		}
		if(pos==size)
		{
			atLast(val);
			return;
		}
		if(pos>size)
		{
			System.out.println("Invalid");
			return;
		}
		Node newNode=new Node(val);
		Node temp=head;
		Node tem=head.next;
		Node temp1=newNode;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
			tem=temp.next;
		}
		temp.next=temp1;
		temp1.next=tem;	
	}
}
public class SinglyLinkedList2 {
	public static void main(String[] args)
	{
		LinkedList2 obj=new LinkedList2();
		obj.atFirst(20);
		obj.atFirst(30);
		obj.atFirst(33);
		obj.atLast(25);
		obj.atLast(50);
		obj.insert(4, 15);
		obj.display();
		
		
	}

}
