package Class_java;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*0 1 1 2 3 5 8 13 21 34
		 * 
		 * f1=0,f2=1.f3=f1+f2=0+1=1
		 * f1=f2 
		 */
		System.out.println("Enter the total number of generations : ");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int j=3;j<=n;j++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}

	}

}
