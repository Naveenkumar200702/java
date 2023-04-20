package assignment;

class DLinkedList1{
	class Node{
		int data;
		Node next;
		Node previous;
		Node(int val)
		{
			data=val;
			next=null;
		}
		
	}
	Node head;
	Node tail;
	DLinkedList1(){
		head=null;
		tail=null;
	}
	public void add(int val) {
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			head.previous=null;
			tail=newNode;
			tail.next=null;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
		
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
}
public class DoublyLinkedList1 {
	public static void main(String[] args)
	{
		DLinkedList1 obj=new DLinkedList1();
		obj.add(10);
		obj.add(15);
		obj.add(20);
		obj.display();
	}

}
