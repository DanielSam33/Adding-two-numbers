package Class_java;

import java.util.Scanner;

public class Reverse_sum_of_digits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,rem;
		System.out.println("Numbers =");
		n=s.nextInt();
		 
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			System.out.print(rem);
			//sum1=sum1+rem;
		}
		//System.out.println("Sum of all digits ="+sum1);
		s.close();
	}

}
