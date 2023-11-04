package Class_java;

import java.util.Scanner;

public class Tech_Number_3no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int num,len=0;
		String str=String.valueOf(n);
		//convesion of string
		len=str.length();
		if(len==4) {
			num=(n/100)+(n%100);
			if(num*num==n) {
				System.out.println("Tech Number");
				
			}
			else {
				System.out.println("Not a Tech Number");
			}
		}
		else {
			System.out.println("Not a Valid number!");
		}
		s.close();
	}

}
