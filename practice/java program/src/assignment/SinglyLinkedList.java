package assignment;
class LinkedList{
//insertion and deletion takes place at end of the list
	class Node{
		int data;
		Node next;
		
		Node(int input)
		{
			data=input;
			next=null;
		}	
	}
	Node head;
	Node tail;
	LinkedList(){
		head=null;
	}
	public void insertValue(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}	
	}
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void delete()
	{
		Node temp;
		temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;	
	}
}
public class SinglyLinkedList {	
	public static void main(String[] args)
	{
		LinkedList slist=new LinkedList();
		slist.insertValue(10);
		slist.insertValue(5);
		slist.insertValue(15);
		slist.display();	
		System.out.println();
		slist.delete();
		slist.delete();
		slist.display();	
	}
}

