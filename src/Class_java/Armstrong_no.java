package Class_java;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/*armstrong no=153=1*1*1 + 5*5*5 + 3*3*3=1+125+27=153
		*1634=1*1*1*1 +6*6*6*6 +3*3*3*3	+4*4*4*4
		*9=9
		*11=1*1+1*1
		*/
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int rem,sum=0,temp=n;
		String str=String.valueOf(n);
		int len=str.length();
		while(n>0) {
		rem=n%10;
		sum=(int)(sum + Math.pow(rem,len));
		n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		s.close();
		
		
		
		
}
}
