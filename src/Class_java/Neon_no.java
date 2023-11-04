package Class_java;

import java.util.Scanner;

public class Neon_no {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number :");
	int a=s.nextInt();
	int rem,sum=0;
	int temp=a;
	int p=a*a;
	while(p>0) {
		 rem=p%10;
		 sum=rem+sum;
		 p=p/10;
	}
	if(temp==sum) {
		System.out.println("It is a neon number");
	}
	else if(temp!=sum) {
		System.out.println("Not a neon number");
	}	
	}
	}



