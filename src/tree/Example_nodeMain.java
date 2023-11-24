package tree;

public class Example_nodeMain {

	public static void main(String[] args) {
		
		Example_nodedata n=new Example_nodedata(10);
		
		n.Left =new Example_nodedata(20);
		n.Right =new Example_nodedata(30);
		n.Left.Left =new Example_nodedata(21);
		 Display(n);
		
	}
	
	public static void Display(Example_nodedata head) {
		
		Example_nodedata current=head;
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.Right;
		}
		
	}

}
