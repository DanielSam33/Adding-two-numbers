package skillenza;

import java.util.ArrayList;
import java.util.List;

public class Pairsum {
	
	public static int sumSecondElements(List<Pair<Integer,Integer>> List) {
		int sum=0;
		for(Pair<Integer,Integer> pair:List) {
			sum+=pair.Second;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		List arr=new ArrayList<Pair<Integer, Integer>>();
		arr.add(new Pair<Integer, Integer>(1,2));
		arr.add(new Pair<Integer, Integer>(3,4));
		arr.add(new Pair<Integer, Integer>(5,6));
		arr.add(new Pair<Integer, Integer>(7,8));
		arr.add(new Pair<Integer, Integer>(9,10));
		
		System.out.println(sumSecondElements(arr));

	}
	
	public static class Pair<F,S>{
		F First;
		S Second;
		
		public Pair(F first,S second) {
			this.First=first;
			this.Second=second;
		}
	}

}
