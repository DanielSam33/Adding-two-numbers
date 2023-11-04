package assessment;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int a=s.nextInt();
		System.out.println("Enter the 2nd number :");
		int b=s.nextInt();
		//int c=(int)(Math.pow(a,b));
		//int d=(int)(Math.pow(a, b));
		if(a*b==a*a) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
