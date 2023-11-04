package Class_java;

public class Get_set {
	int emp_id;
	String emp_name;
	double salary;
	void setEmp() {
		emp_id=1;
		emp_name="Vicky";
		salary=10000;
	}
	void getEmp() {
		System.out.println("Enter the Id:"+emp_id);
		System.out.println("Enter the Name:"+emp_name);
		System.out.println("Enter the Salary:"+salary);
	
	}

	public static void main(String[] args) {
		Get_set s=new Get_set();
		System.out.println("State Emp Id:"+s.emp_id);
		System.out.println();

	}

}
