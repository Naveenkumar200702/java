package assignment;
class LinkedList1{// linked list to insert and delete at the first position
	class Node{
		int data;
		Node next;
		Node(int value)
		{
			data=value;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	LinkedList1(){
		head=null;
	}
	
	public void addAtfirst(int val)
	{
	 Node newNode=new Node(val);
	 if(head==null)
	 {
		 head=newNode;
		 tail=newNode;
	 }
	 else
	 {
		 Node temp;
		 temp=head;
		 head=newNode;
		 head.next=temp; 
	 }
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
	public void delete()
	{
		Node temp=head;
		head=temp.next;
	}
}

public class SinglyLinkedList1 {
	
	public static void main(String[] args)
	{
		LinkedList1 obj=new LinkedList1();
		obj.addAtfirst(10);
		obj.addAtfirst(20);
		obj.addAtfirst(15);
		obj.addAtfirst(25);
		obj.display();
		obj.delete();
		System.out.println();
		obj.display();
	}

}
