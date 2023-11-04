package Class_java;

import java.util.Scanner;

public class Simple_calculator {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,se;
	double result=0;
	char ch;
	System.out.println("Enter the 1st number :");
	i=s.nextInt();
	System.out.println("Enter the 2nd number :");
	se=s.nextInt();
	System.out.println("Enter the Operator(+,-,*,/) :");
	ch=s.next().charAt(0);
	switch(ch) {
		case '+':
			result=i+se;
			break;
		case '-':
			result=i-se;
			break;
		case '*':
			result=i*se;
			break;
		case '/':
			result=i/se;
			break;
	default:
		System.out.println("Error!! Operator is not coorect.");		
		//float,double=%f,int=%d / %i,string=%s,char=%c//
	}
	System.out.printf("%d %c %d= %.2f\n",i,ch,se,result);
	System.out.println(i+" "+ch+" "+se+"= "+result);
	s.close();
	}}

