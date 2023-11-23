package practice;

public class Sum_of_numbers {
	
	public void Sum() {
		int n=5;
		int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum+=i;
			 System.out.println("Sum of 5 Natural numbers :"+sum);
		 }
		 
		for(int i=n;i>=1;i--) {
			
		System.out.println(i);	
	}
		
		int math=0;
		math=n*(n+1)/2;
		System.out.println("Sum of 5 is "+math);
	}
	

	public static void main(String[] args) {
		Sum_of_numbers s=new Sum_of_numbers();
		s.Sum();

	}

}
