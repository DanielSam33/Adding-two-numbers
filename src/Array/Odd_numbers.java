package Array;

import java.util.Scanner;

public class Odd_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements one by one :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
System.out.println("Odd numbers in the array :");
for(int i=0;i<n;i++)
{
	if(arr[i]%2!=0) {
		System.out.print(arr[i]+" ,");
	}
	}
System.out.println("\nEven numbers in the array :");
for(int i=0;i<n;i++) {
	if(arr[i]%2==0) {
		System.out.print(arr[i]+" ,");
	}
}
	}

}
