package Class_java;

import java.util.Scanner;

public class Abundant_no {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int sum=0;
			for(int i=1;i<=n/2;i++) {
				
				if(n%i==0) {
					sum=sum+i;
			}
			}
				if(sum>n) {
					System.out.println("Abundant number!!");
				}
				else {
					System.out.println("Not an Abundant number!!");
				}
		s.close();
}
}

