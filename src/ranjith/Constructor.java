package ranjith;

public class Constructor {
	
	int index;
	String name;

	/*public Constructor(int index) { //constructor
	this.index=index;
	}*/

	public Constructor(int index,String name) { //constructor overloadng
	this.index=index;
	this.name=name;
	}
	
	/*public Constructor() {
		// TODO Auto-generated constructor stub
	}*/

	/*public void setindex(String na) {//function
		this.name=na;
	}*/

	public void setindex(int index) {//function overloading
		this.index=index;
	}
	
	public int getindex() {
		return index;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	}
