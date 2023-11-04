package assessment;

import java.util.Scanner;

public class Ticket_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Ticket Number :");
		int t=s.nextInt();
		int[]t1=new int[t];
		for(int i=0;i<t;i++) {
			t1[i]=s.nextInt();
		}
		System.out.println("Enter the Date of the month :");
		int k=s.nextInt();
		for(int i=0;i<t;i++) {
		if(t1[i]%k==0) //discount applicable
			System.out.print("1 ");
		
		else //if(t1[0]%k!=0) 
			System.out.print("0 ");
		}
		s.close();
	}
}

