package Class_java;

import java.util.Scanner;

public class Prime_no_or_not {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		for(int j=2;j<n/2;j++) {
			if(n%j==0) {
				flag=1;
				break;
			}
				
		}
		if(flag==0&&n!=1) 
			System.out.println(n+" is a prime number");
		else if(n!=1)
			System.out.println(n+" is not a prime number");
		s.close();
	}

}
