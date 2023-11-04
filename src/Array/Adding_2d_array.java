package Array;

import java.util.Scanner;

public class Adding_2d_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row");
		int row=s.nextInt();
		System.out.println("enter the column");
		int col=s.nextInt();
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		int c[][]=new int[row][col];
		System.out.println("matrix a");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
System.out.println("matrix b");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("Array matrix A elememts:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array matrix b elememts:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Addition:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Subtraction:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
