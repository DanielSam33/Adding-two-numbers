package string;

public class Comapreto_equal {

	public static void main(String[] args) {
		String s1="google";
		String s2="google";
		String s3=new String("google");
		System.out.println(s1.equals(s2));//compare the valaues
		System.out.println(s1==s2);//cpamre the values and dtatatypes
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
	}
}
