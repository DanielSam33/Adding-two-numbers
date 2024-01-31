package object;

import java.util.Scanner;

public class Basic2 {
	int stud_id;
	String stud_name;
	void print(int id, String name) 
	{
		stud_id=id;
		stud_name=name;
		System.out.println("Student ID = "+stud_id);
		System.out.println("Student Name = "+stud_name);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the ID = ");
		int id=s.nextInt();
		System.out.print("Enter the Name = ");
		String name=s.next();
		Basic2 obj=new Basic2();
		obj.print(id,name);
		s.close();
	}
}
