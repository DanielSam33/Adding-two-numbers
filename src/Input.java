import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		String str1;
		System.out.print("enter the value of a: ");
		a=s.nextInt();
		System.out.print("enter the value of string: ");
		str1=s.next();
		System.out.println("The value of a: "+a);
		System.out.println("The value of string: "+str1);
		
	}

}
