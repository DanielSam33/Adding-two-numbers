package Array;

import java.util.Scanner;

public class Duplicate_occurence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements you want :");
				int n=s.nextInt();
				int arr[]=new int[n];
				System.out.println("Enter all the elements:");
				int temp[]=new int[n];
				int count=0;
				for(int i=0;i<n;i++) 
					arr[i]=s.nextInt();
					System.out.print("Enter the elements of which you want to "+"count number of occurences: ");
					int search=s.nextInt();
					for(int i=0;i<n;i++) {
						if(arr[i]==search)
							count++;
				}
				
				if(count>0)
					System.out.println("Number of occurences of the element: "+count);
				else
					System.out.println("Number of occurences of the element: "+count);
				s.close();
	}

}
