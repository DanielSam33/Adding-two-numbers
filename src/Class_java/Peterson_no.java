package Class_java;

import java.util.Scanner;

public class Peterson_no {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number :");
	int n=s.nextInt();
	int rem=0,sum=0,fact,temp=n;
	//rem=n%10;
	while(n>0) { //145
		fact=1;
		rem=n%10;  //5
	for(int i=1;i<=rem;i++) {  //5! +4!+1!
		fact=fact*i;
	}
	sum=sum+fact;  //0+5!
	n=n/10;
	}
	//int u=sum+sum;
	if(temp==sum) {
		System.out.println("It is Factorial!!");
	}
	else {
		System.out.println("Not a Factorial!!");
	}
	s.close();
	}
}
