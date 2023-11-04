package string;

public class LastIndexOf {

	public static void main(String[] args) {
		String s1="Hello world,Hello world";
		int lastindex1=s1.lastIndexOf("Hello");
		if(lastindex1==-1) {
			System.out.println("Hello not found!");
			
		}
		else {
			System.out.println("Last occurence of Hello is at "+lastindex1);
		}
		
		

	}

}
