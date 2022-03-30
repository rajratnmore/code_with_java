package java_programs;

public class MoveElementAtEnd {
	
	static void moveStringElement(StringBuilder str,char ch,int first,int last) {
		
		if(first >= last) {
			System.out.println(str);
			return;
		}
		
		if(str.charAt(first)==ch && str.charAt(last)!=ch) {
			char t = str.charAt(last);
			str.setCharAt(last,str.charAt(first));
			str.setCharAt(first,t);
			moveStringElement(str,ch,++first,--last);
		}
		else if(str.charAt(first) == ch && str.charAt(last) == ch) {
			moveStringElement(str,ch,first,--last);
		}
		else
			moveStringElement(str,ch,++first,last);
		
	}

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("axxbcxxd");
		
		moveStringElement(str,'x',0,str.length()-1);		
		
//		System.out.println(str.charAt(1));
		

	}

}
