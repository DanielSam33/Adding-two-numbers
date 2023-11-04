package Class_java;

import java.util.Scanner;

public class Pattern_joining1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no :");
		int n=s.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k=n-1;
		for(int i=1;i<=k;i++) {
			for(int j=k;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
