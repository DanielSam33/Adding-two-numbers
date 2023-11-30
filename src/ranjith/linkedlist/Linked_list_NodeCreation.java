package ranjith.linkedlist;

public class Linked_list_NodeCreation {

	int data;//value=0
	Linked_list_NodeCreation next;//value=nul
	
	Linked_list_NodeCreation(int data){
		this.data=data;
	}
	
	Linked_list_NodeCreation (int data,Linked_list_NodeCreation next) {
		this.data=data;
		this.next=next;
	}
	
}
