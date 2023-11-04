package string;

public class Compareto {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="hello world";
		Object objstr=s1;
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(objstr.toString());

		

	}

}
