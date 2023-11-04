package Class_java;

import java.util.Scanner;

public class Sunny_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a=s.nextInt(); //80
		int p;
		p=(int)(Math.sqrt(a+1)); //9
		int q=(int)(Math.pow(p, 2)); //9 pow 2 = 81
		if(q==(a+1)) {
			System.out.println("It is a sunny number");
		}
		else  {
			System.out.println("Not a sunny number");
		}
		s.close();
	}
}
