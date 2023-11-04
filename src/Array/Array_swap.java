package Array;

import java.util.Scanner;

public class Array_swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int input=s.nextInt();
		int arr[]=new int[input];
		for(int i=0;i<input;i++) 
			arr[i]=s.nextInt();
		if(input%2==0) {
		for(int i=1;i<input;i+=2) 
			System.out.print(arr[i]+" "+arr[i-1]+" ");
		}
		else {
			for(int i=1;i<input-1;i+=2)
			System.out.print(arr[i]+" "+arr[i-1]+" ");
			System.out.println(arr[input-1]);
		}
		s.close();
	}

}
