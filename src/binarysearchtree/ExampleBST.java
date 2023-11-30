package binarysearchtree;

public class ExampleBST {
	Node root;
	Boolean isAvailable=false;
	
	public Node insert(int value) {
		return insert(root,value);
	}
	
	public Node insert(Node node,int value) {
		if(root==null) {
			node =new Node(value);
			if(root==null) {
				root=node;
			}
			return node;
		}
		
		if(value<node.value) {
			node.setLeft(insert(node.getLeft(),value));
		}
		else
		{
			node.setRight(insert(node.getRight(),value));
		}
		return node;
	}
	
	public Node search(int value) {
		isAvailable=false;
		return search(value,root);
	}
	
	public Node search(int value,Node currentroot) {
		if(currentroot!=null && currentroot.getData()==value) {
			isAvailable=true;
			return currentroot;
		}
		
		else if(currentroot!=null && currentroot.getData()>value)
		{
			return search(value,currentroot.getLeft());
		}
		
		else if(currentroot!=null && currentroot.getData()<value)
		{
			return search(value,currentroot.getRight());
		}
		
		return currentroot;
		
	}
	public static void main(String[] args) {
		ExampleBST s=new ExampleBST();
		s.insert(19);
		s.insert(15);
		s.insert(25);
		s.insert(39);
		s.insert(17);
		s.insert(14);
		s.insert(21);
		s.insert(24);
		
		int searchVal1=21;
		int searchVal2=19;
		int searchVal3=18;
		int searchVal4=24;
		
		s.search(searchVal1);
		System.out.println(searchVal1+" : "+s.isAvailable);
		s.search(searchVal2);
		System.out.println(searchVal2+" : "+s.isAvailable);
		s.search(searchVal3);
		System.out.println(searchVal3+" : "+s.isAvailable);
		s.search(searchVal4);
		System.out.println(searchVal4+" : "+s.isAvailable);
		
		
		
		
		

	}
	
	public class Node{
		int value;
		Node Left;
		Node Right;
		
		Node (int data) {
			this.value=data;
		}
		
//		Node(int data,Node insert){
//			this.data=data;
//			this.Left=insert;
//			this.Right=insert;
//		}
		
		public int getData() {
			return value;
		}
		
		public Node getRight() {
			return Right;
		}
		public Node getLeft() {
			return Left;
		}
		public void setData(int data) {
			this.value = data;
		}
		public void setLeft(Node left) {
			Left = left;
		}
		public void setRight(Node right) {
			Right = right;
		}
		
	}

}
