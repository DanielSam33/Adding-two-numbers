package practice;

public class BinaryTreeFindAValue {
	Node node;
	
	public BinaryTreeFindAValue(Node node) {
		this.node=node;
	}
	
	public void Preorder() {
		Preorder(node);
	}
	
	public void Preorder(Node current) {
		Node temp=current;
		
		if(temp.data!=current.data) {
			System.out.println(temp.data+"\nOUTPUT : False");
		}
		
		if(temp.data==current.data) {
			System.out.println(temp.data+"\nOUTPUT : True");
		}

	}
	
	
	public static void main(String[] args) {
		
		Node n=new Node(21);
		n.Left=new Node(9);
		n.Left.Left=new Node(23);
		n.Left.Right=new Node(18);
		n.Left.Left.Left=new Node(12);
		n.Left.Left.Right=new Node(13);
		n.Right=new Node(6);
		n.Right.Left=new Node(7);
		n.Right.Left.Left=new Node(17);
		n.Right.Right=new Node(16);
		n.Right.Right.Left=new Node(15);
		n.Right.Right.Left.Left=new Node(11);
		
		BinaryTreeFindAValue s=new BinaryTreeFindAValue(n);
		s.Preorder();
		
		

	}
	 class Node {
		int data;
		Node Left;
		Node Right;
		
		public Node(int data) {
			this.data=data;
			this.Left=null;
			this.Right=null;
		}
		
		
	}
}
