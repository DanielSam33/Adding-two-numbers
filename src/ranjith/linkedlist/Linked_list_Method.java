package ranjith.linkedlist;

public class Linked_list_Method {
	
	Linked_list_NodeCreation head;
	Linked_list_NodeCreation tail;
	
	public void Insert(int data){
		
		Linked_list_NodeCreation newnode=new Linked_list_NodeCreation(data);
		
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void Display() {
		Linked_list_NodeCreation temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
			System.out.print(" -> ");
		}
	}
	
	public void CircularLinkedList(int data) {
		
	}
	
	public void InsertAtBeginning(int data) {
		Linked_list_NodeCreation insert=new Linked_list_NodeCreation(data);
		if(head==null) {
			head=insert;
		}
		
		else {
			insert.next=head;
			head=insert;
		}
	}
	
	public void InsertBeginning(int data) {
		Linked_list_NodeCreation insert=new Linked_list_NodeCreation(data);
		insert.next=head;
		head=insert;
	}
	
	public void InsertAtPosition(int pos,int data) {
		
		Linked_list_NodeCreation insert=new Linked_list_NodeCreation(data);
		Linked_list_NodeCreation temp=head;
		for(int i=0;i<pos-1;i++) 
			temp=temp.next;
			insert.next=temp.next;
			temp.next=insert;	
	}
	
	public void InsertPosition(int data,int pos) {
		if(pos==0) {
			InsertBeginning( data);
			return;
		}
		
		Linked_list_NodeCreation temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		
		Linked_list_NodeCreation newnode=new Linked_list_NodeCreation(data,temp.next);
		temp.next=newnode;
	}
	
	public void DeleteAtBeginning() {
		Linked_list_NodeCreation temp=head;
		head=head.next;
		temp.next=null;
		}
	
	public void DeleteAtEnd() {
		Linked_list_NodeCreation temp=head;
		while(temp.next!=tail)
			temp=temp.next;
			temp.next=null;
			tail=temp;
	}
	
	public void DeleteAtPosition(int pos) {
		Linked_list_NodeCreation temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;	
	}
	
	public Linked_list_NodeCreation find(int data) {
		Linked_list_NodeCreation node=head;
		while(node!=null) {
			if(node.data==data) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
}
