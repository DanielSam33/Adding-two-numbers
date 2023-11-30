package tree;

public class ExampleBinaryTreeFunction {

	BT1 node;
	
	public ExampleBinaryTreeFunction(BT1 node) {
		this.node=node;
	}
	
	public void inorder()
	{
		inorder(node);
	}
	
	public void inorder(BT1 current) {
		
		if(current!=null) {
			inorder(current.Left);
			System.out.print(current.data+" ");
			inorder(current.Right);
		}
	}
	
	public void preorder() {
		preorder(node);
	}
	
	public void preorder(BT1 current) {
		if(current!=null) {
			System.out.print(current.data+" ");
			preorder(current.Left);
			preorder(current.Right);
		}
	}
	
	public void postorder() {
		postorder(node);
	}
	
	public void postorder(BT1 current) {
		if(current!=null) {
			postorder(current.Left);
			postorder(current.Right);
			System.out.print(current.data+" ");
		}
	}
	
}
