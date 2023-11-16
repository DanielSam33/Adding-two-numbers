package assessment;

public class Primeno_palindrome {
	
	public static void main(String[] args) {
		
		String arr[]= {"raccar","malayalam","example","encap"};
		StringBuffer ar=new StringBuffer();
		int ap[]= {13,17,21,31,5,999991,23,25};
		int i=0;
		primeno(ap,i);
		
	}

	public static void palindrome(String arr[],StringBuffer ar) {
		ar.toString();
		for(int i=0;i<arr.length;i++) {
				
				
			}
		}
		
	public static void primeno(int [] ap,int i){
		for( i=0;i<ap.length;i++) {
			if(ap[i]>0) {
			if(ap[i]%1==0 && ap[i]%ap[i]==0) {
				System.out.println("Prime number!!");
			}
			else {
				System.out.println("Not a prime number!!");
			}
			}
			else {
				primeno(ap,i++);
			}
		}
		
	}
}
