package Array;

public class Array_for_each {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		String str2[]={"one","two","three"};
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n For each loop:");
		for(int num:numbers) {
			System.out.print(num+" ");
			
		}
		System.out.println("\n String array:");
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}
		System.out.println("\n For each loop string array:");
		for(String num:str2) {
			System.out.print(str2+" ");
			
		}
		
		}
	}


