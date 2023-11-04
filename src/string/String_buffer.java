package string;

public class String_buffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		StringBuffer sa=new StringBuffer(20);
		StringBuffer sd=new StringBuffer("Welcome");
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(sa);
		System.out.println(sd);
		s.append("yuejcwe jinid  ijiuduh");
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.setLength(5);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println(s.length());
		
		

	}

}
