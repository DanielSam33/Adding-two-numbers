package ranjith.linkedlist;

public class Linked_list_Method {
	
	Linked_list_NodeCreation head;
	Linked_list_NodeCreation tail;
	
	public void Insert(int data){
		
		Linked_list_NodeCreation n=new Linked_list_NodeCreation(data);
		n.next=null;
		
		if(head==null) {
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
	}
	
	public void Display() {
		Linked_list_NodeCreation temp=head;
		
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);         // insert at end method
	}
	
}
