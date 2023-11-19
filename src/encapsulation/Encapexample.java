package encapsulation;

import java.util.Scanner;

public class Encapexample {
	int A;
	
	public void setA(int a) {
		this.A=a;
		
	}
	
	public int getA()
	{
	return A;	
	}

	public static void main(String[] args) {
		Encapexample n=new Encapexample();
		n.setA(32);
		n.getA();
		System.out.println("Input = "+n.getA());
		System.out.println("a = "+n.getA());
	}
	
}
