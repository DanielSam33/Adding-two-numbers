package Class_java;

import java.util.Scanner;

public class Spy_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=s.nextInt();
		int rem=0,q,sum=0,p=1;
		rem=a%10;
		sum=sum+rem;
		p=p*rem;
		q=a/10;
		if(sum==p) {
			System.out.println("It is a spy number!!");
		}
		else
		{
			System.out.println("It is a spy number!!");
		}
		
		

	}

}
