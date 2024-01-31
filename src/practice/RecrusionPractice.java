package practice;

public class RecrusionPractice {
	
	char data='A';
	
	public void Alphabet(char data) {
		this.data=data;
	}
	
	public void Alphabet(char data) {
		String num1=data;
		char print[]=num1.toCharArray();
		System.out.println(print[0]);
	}

	public static void main(String[] args) {
		RecrusionPractice a=new RecrusionPractice();
		a.Alphabet();
		

	}
}
