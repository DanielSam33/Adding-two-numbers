package Class_java;

import java.util.Scanner;

public class Reverse_factorial {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			int result=1;
			for (int i=n;i>=1;i--) 
			{
				result*=i;//result=result+i;
			}
			System.out.println("Factorial of natural numbers ="+result);
			s.close();
	}

}
