package lowerandupperbound;

public class Lowerexample {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int i=0;
		int j=1;
		int val=5;
		name(a,i,j,val);

	}
	
	public static void name(int a[],int i,int j,int val) {
		if(a.length==i) {
			return;
		}
		else {
			if(a[i]<a[j]) {
				if(a[i]==val) {
					System.out.println("lower bound :"+i);
					System.out.println("upper bound :"+(i+1));
					return;
			}
				else {
					name(a,i+1,j+1,val);//recursion function
				}
				}
				
			
			else {
				System.out.println("Sorted array is not in the array.");
			
		
		}
		
	}

}
}
