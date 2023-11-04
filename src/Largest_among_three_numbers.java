import java.util.Scanner;

public class Largest_among_three_numbers {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 1st Number :");
	a=s.nextInt();
	System.out.println("Enter 2nd Number :");
	b=s.nextInt();
	System.out.println("Enter 3rd Number :");
	c=s.nextInt();
	if((a>b)&&(a>c))
	{
		System.out.println("The Largest Number :"+a);
	}
	else if((b>a)&&(b>c))
	{
		System.out.println("The Largest Number :"+b);
		
	}
	else
	{
		System.out.println("The Largest Number :"+c);
	}
				

	}

}
