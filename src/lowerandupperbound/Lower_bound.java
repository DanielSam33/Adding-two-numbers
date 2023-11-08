package lowerandupperbound;

public class Lower_bound {

	public static void main(String[] args) {
		int a[]= {9,10,12,49,58,78,100};
		print(a,0);
		

	}
	public static void print(int a[],int i) {
		if(a.length==(i)) {
			return;
		}
		else
		{
			System.out.println(i+":"+a[i]);
			print(a,i+1);
		}	
	}		
	}


