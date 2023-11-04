package Class_java;

import java.util.Scanner;

public class Student_marklist {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int id,m1,m2,m3,t,average;
		String name,remark;
		System.out.println("Student ID :");
		id=s.nextInt();
		System.out.println("Student Name :");
		name=s.next();
		System.out.println("Tamil :");
		m1=s.nextInt();
		System.out.println("English :");
		m2=s.nextInt();
		System.out.println("Science :");
		m3=s.nextInt();
		t=m1+m2+m3;
		average=t/3;
		System.out.println("Total :"+t);
		
		System.out.println("Average :"+average);
		
		if(average>90 || average>80)
		{
			System.out.println("Remarks : Excellent!");
		}
		else if(average>80)
		{
			System.out.println("Remarks : Very Good");
		}
		else if(average>70)
		{
			System.out.println("Remarks : Good");
		}
		else if(average>60)
		{
			System.out.println("Remarks : Need to Improve");
		}
		
		else
		{
		System.out.println("Remarks : Fail");
	}
	}
}
