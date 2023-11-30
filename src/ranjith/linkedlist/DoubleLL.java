package ranjith.linkedlist;

public class DoubleLL {
	Node head;
	 
	public void InsertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		
		if(head!=null)
		{
			head.prev=node;
		}
		head=node;
	}
	
	
	public void Display() {
		Node  node=head;
		Node last=null;
		while(node!=null) {
			System.out.print(node.val+" -> ");
			last=node;
			node=node.next;
		}
		System.out.println("END");
		System.out.println();
		
		System.out.println("Print in Reverse : ");
		while(last!=null) {
			System.out.print(last.val+" -> ");
			last=last.prev;
		}
		System.out.println("START");
		System.out.println();
	}
	
	
	public void InsertLast(int val) {
		Node node=new Node(val);
		Node last=head;
		
		node.next=null;
		
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
	}
	
	
	public void InsertAt(int val,int pos) {
		
	}
	
	
	public static void main(String[] args) {
		DoubleLL a=new DoubleLL();
		a.InsertFirst(10);
		a.InsertFirst(20);
		a.InsertFirst(30);
		a.InsertFirst(40);
		a.Display(); 
		System.out.print("-------\n");
		a.InsertLast(50);
		a.Display();
		System.out.print("-------\n");

	}
	
	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val=val;
		}
		
		public Node(int val,Node next,Node prev) {
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
	}
}
