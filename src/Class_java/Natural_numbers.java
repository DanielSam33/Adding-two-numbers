package Class_java;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		int result=0;
		for (int i=1;i<=n;i++) 
		{
			result+=i;//result=result+i;
		}
		System.out.println("Sum of natural numbers ="+result);
		s.close();
	}

}
