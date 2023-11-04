package assessment;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter the input = ");
		double r=s.nextDouble();
		double r2=(double)(Math.pow(r, 2));
		double area = pi*r2;
		System.out.println("Area of the triangle = "+area);
		
	
	}
}
