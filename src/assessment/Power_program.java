package assessment;

import java.util.Scanner;

public class Power_program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=s.nextInt();
		System.out.println("Enter the value:");
		int b=s.nextInt();
		System.out.println("Enter the value:");
		int c=s.nextInt();
		int a1=(int)(Math.pow(a, 2));
		int b1=(int)(Math.pow(b, 2));
	    int c1=(int)(Math.pow(c, 2));
	    if((a<=100000)||(b<=100000)||(c<=100000)){
		if(c1!=(a1+b1)) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
		
		
	}
	}
}
