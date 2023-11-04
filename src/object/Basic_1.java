package object;

public class Basic_1 {
	int stud_id=1;
	String stud_name="Joseph";
	void print() 
	{
		System.out.println("Student ID ="+stud_id);
		System.out.println("Student Name ="+stud_name);
	}
	

	public static void main(String[] args) {
		Basic_1 obj=new Basic_1();
		obj.print();

	}

}
