package Class_java;

import java.util.Scanner;

public class Vowel_or_not {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				char ch=s.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'
				||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
		System.out.println("Vowel");	

	}
		else
		{
			System.out.println("Not a vowel");
		}
		s.close();
		
}
}