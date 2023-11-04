package string;

public class Reversestringbuffer_contains {

	public static void main(String[] args) {
		String string="abcde_1234";
		String reverse1 =new StringBuffer(string).reverse().toString();
		System.out.println("String before Reverse: "+string);
		System.out.println("String after reverse:"+reverse1);
		String input="abcdef";
		char[] try1=input.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
			System.out.print(try1[i]);
		String text="The cat is on the wall";
		System.out.println("\n"+text.contains("the"));
		System.out.println("sub string of text:"+text.substring(4,7));
		}
}
