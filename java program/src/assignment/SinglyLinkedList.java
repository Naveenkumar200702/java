package assignment;


public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void add(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	void display() {
		Node current=head;
		if(head==null)
		{
			System.out.println("the list is empty");
			return;
		}
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		SinglyLinkedList slist=new SinglyLinkedList();
		slist.add(10);
		slist.add(15);
		slist.display();
		
	}
	

}
