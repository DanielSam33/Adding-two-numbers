package Array;

import java.util.Scanner;

public class Two_D_array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row");
		int row=s.nextInt();
		System.out.println("enter the column");
		int col=s.nextInt();
		int a[][]=new int [row][col];
		System.out.println("enterthe elements one by one");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Array mtrix A elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}
