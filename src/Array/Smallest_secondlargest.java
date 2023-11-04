package Array;

import java.util.Scanner;

public class Smallest_secondlargest {

	public static void main(String[] args) {
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array(minimum:2): ");
		 n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
			}
		}

	}
		System.out.println("Second Largest no: "+a[n-2]);
		System.out.println("Smallest:"+a[0]);
		s.close();
	}
}
