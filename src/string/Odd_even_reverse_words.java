package string;

import java.util.Scanner;

public class Odd_even_reverse_words {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String input=s.next();
		int len=input.length();
		char ch[]=input.toCharArray();
		if(len%2==0) {
		for(int i=1;i<len;i+=2) 
			System.out.print(ch[i]+""+ch[i-1]);	
			}
		else {
			for(int i=1;i<len-1;i+=2) 
				System.out.print(ch[i]+""+ch[i-1]);
				System.out.print(ch[len-1]);
		}
		s.close();
	}

}
