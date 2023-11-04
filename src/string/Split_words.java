package string;

import java.util.Scanner;

public class Split_words {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Line :");
		String str=s.nextLine();
		String str1[]=str.split(" ");
		System.out.println(str1[1]+" "+str1[0]);
		

	}

}
