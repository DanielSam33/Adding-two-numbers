package access_modifier;

class base{
	private int a=10;
	private int b=20;
	void display() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

public class Access1 {
	private int x=10;
	private int y=20;
	

	public static void main(String[] args) {
		Access1 obj1=new Access1();
		base obj2=new base();
		System.out.println("x="+obj1.x);
		System.out.println("y="+obj1.y);
		obj2.display();
		System.out.println("a="+obj2.a);
		System.out.println("b="+obj2.b);
		

	}

}
