package practice;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value :");
		double num=s.nextDouble();
		
		
			if(num>0) {
				double pi=3.14;
				double result=pi*(num*num);
				System.out.println("Area Of Circle : "+result);
			}
			else {
				System.out.println("Invalid Input");
			}
		
		s.close();
	}
}
