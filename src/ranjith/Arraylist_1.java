package ranjith;

import java.util.ArrayList;

public class Arraylist_1 {

	public static void main(String[] args) {
		
		ArrayList<Constructor> arr1=new ArrayList<Constructor>();
		
		Constructor obj= new Constructor(10,"Abi");
		arr1.add(obj);
		arr1.add(new Constructor(20,"Bala"));
		arr1.add(new Constructor(30,"Clair"));
		arr1.add(new Constructor(40,"Dimu"));
		arr1.add(new Constructor(50,"Eclir"));
		arr1.add(new Constructor(60,"frog"));
		arr1.add(new Constructor(70,"gopal"));
		arr1.add(new Constructor(80,"hike"));
		arr1.add(new Constructor(90,"jog"));
		arr1.add(new Constructor(100,"ice"));
		
		arr1.remove(5);
		//arr1.remove(obj);
		arr1.contains(obj);
		System.out.println(arr1.indexOf(obj));
		System.out.println(arr1.size());
		
		arr1.forEach(Constructor -> {
			System.out.println(Constructor.name+" : "+Constructor.index);	
		}
		);
	}
}
