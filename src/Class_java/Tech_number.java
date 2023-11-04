package Class_java;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=s.nextInt();
		int rem,q;
		rem=a%100;
		q=a/100;
		int sum;
		sum=rem+q;
		if(sum*sum==a)
		{
			System.out.println(a+" is a Tech Number!");
		}
		else if(sum*sum!=a)
		{
			System.out.println(a+" is not a Tech Number!");
		}
		s.close();
	}

}
