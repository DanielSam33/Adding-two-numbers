package practice;

import java.util.Arrays;

public class Character_index {

	;
	public static void main(String[] args) {
	
		String name="Daniel Samson";
		String[] str=name.split("");
		char[] ch=name.toCharArray();
		int pos=Arrays.asList(str).indexOf("s");
		
		System.out.println(pos+1);
		

		String nam ="Daniel Samson cbe";
		String[] sr=name.split(" ");
		char[] c=nam.toCharArray();
		int po=Arrays.asList(sr).indexOf("Samson");
		
		System.out.println(po+1);
	}

}
