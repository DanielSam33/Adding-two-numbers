package ranjith.encap;

public class Const1 {
int a;
String name;
int regno;

public Const1(int a,String name,int regno) {
	this.a=a;
	this.name=name;
	this.regno=regno;
}

public void seta(int a) {
	this.a=a;
}

public int geta() {
	return a;
}

public void setname(String name) {
	this.name=name;
}

public String getname() {
	return name;
}

public void setregno(int regno) {
	this.regno=regno;
}

public int getregno() {
	return regno;
}

}
