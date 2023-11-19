package ranjith;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int N = scanner.nextInt();
		leapyear(N);

	}
	
	public static void leapyear (int year)
	{
		
		if(year%4 ==0 && year >=1 && year <= 5000)
				{
			System.out.println("Its a Leap Year");
				}
		else
		{
			System.out.println("No");
	}

}
}
