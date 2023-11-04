package string;

public class Position_char {

	public static void main(String[] args) {
		String str="AcLeP @";
		char ch[]=str.toCharArray();
		int vowel=0,consonant=0,uppercase=0,lowercase=0,whitespace=0,special=0;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]=='a'||ch[i]=='e')||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') 
			{
				if(vowel==0) 
					vowel=i+1;
			}
			else if(consonant==0)
			{
				consonant=i+1;
			}
			 if(Character.isUpperCase(ch[i])&&(uppercase==0)) { 
				uppercase=i+1;
			 }
			 else if(Character.isLowerCase(ch[i])&&(lowercase==0)) { 
				 lowercase=i+1;
			}
			else if(Character.isWhitespace(ch[i])&&(whitespace==0)) 
				 whitespace=i+1;
			 
			 else if(special==0) {
				 special=i+1;
			 }
		}
		
		System.out.println("Vowel Position="+vowel);
		System.out.println("Consonant Position="+consonant);
		System.out.println("Capital letter position="+uppercase);
		System.out.println("Lower case letter position="+lowercase);
		System.out.println("Whitespace Position="+whitespace);
		System.out.println("Special position="+special);
	}
	
	
}
