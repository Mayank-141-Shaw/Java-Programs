package example;

public class StringEncoder {
	public String encode(String str) {
		String sb="",vowel="",conn="",even="",odd="",special="";
		char cur;
		for(int i=0;i<str.length();i++) {
			cur=str.charAt(i);
			if(cur=='a'||cur=='e'||cur=='i'||cur=='o'||cur=='u'||cur=='A'||cur=='E'||cur=='I'||cur=='O'||cur=='U') {
				vowel=vowel+cur;
			}
			else {
				conn=conn+cur;
			}
			if(cur=='0'||cur=='2'||cur=='4'||cur=='6'||cur=='8') {
				even=even+cur;
			}
			else if(cur=='1'||cur=='3'||cur=='5'||cur=='7'||cur=='9') {
				odd=odd+cur;
			}
			else {
				special=special+cur;
			}
		}
		sb=sb+special+conn+odd+vowel+even;
		return sb;
	}
}
