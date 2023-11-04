package string;

import java.util.Scanner;

public class Assessment_char_methods {

	public static void main(String[] args) {
		String str1="hello123";
		//System.out.println("Enter the Values :"+a);
		int letter=0,digit=0;
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				digit++;
			}
	}
		System.out.println("Alphabets :"+letter);
		System.out.println("Digits :"+digit);
	}
}
