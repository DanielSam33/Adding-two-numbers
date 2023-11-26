package tree;

public class ExampleBinaryTreeMain {

	public static void main(String[] args) {
		
		ExampleBinaryTreeData n=new ExampleBinaryTreeData(19);
		n.Left=new ExampleBinaryTreeData(17);
		n.Right=new ExampleBinaryTreeData(22);
		n.Left.Left=new ExampleBinaryTreeData(7);
		n.Left.Right=new ExampleBinaryTreeData(2);
		n.Left.Right.Left=new ExampleBinaryTreeData(39);
		n.Left.Right.Right=new ExampleBinaryTreeData(32);
		//n.Left.Left.Left=new ExampleBinaryTreeData(7);
		n.Left.Left.Left=new ExampleBinaryTreeData(33);
		n.Left.Left.Right=new ExampleBinaryTreeData(31);
	    n.Left.Left.Right.Left=new ExampleBinaryTreeData(9);
		n.Left.Left.Left.Left=new ExampleBinaryTreeData(5);
		n.Left.Left.Left.Right=new ExampleBinaryTreeData(29);
		n.Right.Left=new ExampleBinaryTreeData(8);
		n.Right.Right=new ExampleBinaryTreeData(6);
		n.Right.Right.Left=new ExampleBinaryTreeData(16);
		n.Right.Right.Right=new ExampleBinaryTreeData(12);
		n.Right.Right.Left.Left=new ExampleBinaryTreeData(13);
		n.Right.Right.Left.Right=new ExampleBinaryTreeData(14);
		n.Right.Right.Left.Right.Right=new ExampleBinaryTreeData(1);
		n.Right.Right.Left.Right.Right.Right=new ExampleBinaryTreeData(3);
		
		ExampleBinaryTreeFunction w=new ExampleBinaryTreeFunction(n);
		System.out.println("Inorder data :");
		w.inorder(n);
		System.out.println("\nPreorder data :");
		w.preorder(n);
		System.out.println("\nPostorder data :");
		w.postorder(n);
		
		
		

	}

}
