package tree;

public class ExampleBinaryTreeMain {

	public static void main(String[] args) {
		
		BT1 n=new BT1(38);
		n.Left=new BT1(27);
		n.Left.Left=new BT1(20);
		n.Left.Right=new BT1(18);
		n.Left.Right.Right=new BT1(28);
		n.Left.Left.Left=new BT1(55);
		n.Left.Left.Right=new BT1(24);
		n.Right=new BT1(25);
		n.Right.Left=new BT1(45);
		n.Right.Right=new BT1(32);
		n.Right.Left.Left=new BT1(39);
		n.Right.Left.Right=new BT1(8);
		n.Right.Left.Right.Right=new BT1(12);
		n.Right.Left.Right.Right.Left=new BT1(12);
		n.Right.Right.Left=new BT1(13);
		n.Right.Right.Right=new BT1(16);
		n.Right.Right.Right.Left=new BT1(6);
		n.Right.Right.Right.Right=new BT1(4);
		
		
		
		ExampleBinaryTreeFunction w=new ExampleBinaryTreeFunction(n);
		System.out.println("Inorder data :");
		w.inorder(n);
		System.out.println("\nPreorder data :");
		w.preorder(n);
		System.out.println("\nPostorder data :");
		w.postorder(n);
		
		
		

	}

}
