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
			System.out.print(" ");
		}
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
	
	/*public void InsertAtPosition(int position,int data) {
		Linked_list_NodeCreation insert=new Linked_list_NodeCreation(data);
		Linked_list_NodeCreation current=head;
		for(int i=0;i<=position;i++) {
			current=current.next;
		}
		insert.next=current.next;
		current.next=insert;
		
		if(position==0) {
			InsertAtBeginning(data);
			return;
		}
	}*/
	
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
}
