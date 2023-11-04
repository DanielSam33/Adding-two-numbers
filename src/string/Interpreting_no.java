package string;

import java.util.Scanner;

public class Interpreting_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,l,r;
		System.out.println("Enter the 1st number :");
		n=s.nextInt();
		System.out.println("Enter the 2nd number :");
		l=s.nextInt();
		System.out.println("Enter the 3rd number :");
		r=s.nextInt();
		if((n>=l)&&(n<=r)) {
			System.out.println("YES!!");
		}
		else {
			System.out.println("NO!!");
		}
	s.close();	
	}
}
