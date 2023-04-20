package assignment;
class DLinkedList{//Insertion and deletion takes place at first position...
	class Node{
		int data;
		Node previous;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
			previous=null;
		}
	}
	Node head;
	Node tail;
	DLinkedList()
	{
		head=null;
		tail=null;
	}
	public void add(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			head.previous=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}	
	void displayReverse()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.previous;
		}
	}
	void delete()
	{
		head=head.next;
		head.previous=null;
	}
}
public class DoublyLinkedList {
	public static void main(String[] args)
	{
		DLinkedList list=new DLinkedList();
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(30);
		list.display();	
		list.delete();
		System.out.println();
		System.out.println("after deleteing first node");
		list.display();
		System.out.println();
		System.out.println("reverse order");
		list.displayReverse();
	}
}
