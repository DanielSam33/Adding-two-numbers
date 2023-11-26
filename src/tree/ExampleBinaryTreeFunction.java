package tree;

public class ExampleBinaryTreeFunction {

	ExampleBinaryTreeData node;
	
	public ExampleBinaryTreeFunction(ExampleBinaryTreeData node) {
		this.node=node;
	}
	
	public void inorder()
	{
		inorder(node);
	}
	
	public void inorder(ExampleBinaryTreeData current) {
		
		if(current!=null) {
			inorder(current.Left);
			System.out.print(current.data+" ");
			inorder(current.Right);
		}
	}
	
	public void preorder() {
		preorder(node);
	}
	
	public void preorder(ExampleBinaryTreeData current) {
		if(current!=null) {
			System.out.print(current.data+" ");
			preorder(current.Left);
			preorder(current.Right);
		}
	}
	
	public void postorder() {
		postorder(node);
	}
	
	public void postorder(ExampleBinaryTreeData current) {
		if(current!=null) {
			postorder(current.Left);
			postorder(current.Right);
			System.out.print(current.data+" ");
		}
	}
	
}
