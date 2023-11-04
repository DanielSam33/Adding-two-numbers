package Array;

public class Two_d_array2 {

	public static void main(String[] args) {
		//int a[][]=new int[3][2];
		int a[][]= {
				{1,2},
				{3,4},
				{5,6},
		};
		int col=a[0].length;
		int row=a.length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("completed");
System.out.println("row length:"+a.length);
System.out.println("column length:"+a[0].length);

	}

}
