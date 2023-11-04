package Class_java;

import java.util.Scanner;

public class Salary_details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,gross,bonus;
	 String contact;
		String name,address;
	
		System.out.println("Employee ID :");
		id=s.nextInt();
		System.out.println("Employee Name :");
		name=s.next();
		System.out.println("Address :");
		s.nextLine();
		
		address=s.nextLine();
		address=s.nextLine();
		address=s.nextLine();
		System.out.println("Contact :");
		contact=s.next();
		System.out.println("Salary :");
		gross=s.nextInt();
		if(gross>=40000)
		{
			System.out.println("Net salary ="+(gross+8000));
		}
		else if(gross>=30000&&gross<40000)
		{
			System.out.println("Net salary ="+(gross+7000));
			
		}
		else if(gross>=20000&&gross<30000)
		{
			System.out.println("Net salary ="+(gross+5000));
			
		}
		else if(gross>=10000 && gross<20000)
		{
			System.out.println("Net salary ="+(gross+3000));
			
		}
		s.close();
		

	}

}
