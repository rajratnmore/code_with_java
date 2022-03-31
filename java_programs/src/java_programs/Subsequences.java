package java_programs;

public class Subsequences {

	static void subsequence(String str,String newStr,int index) {
		
		if(index == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(index);
		
		subsequence(str,newStr+currChar,index+1);
		
		subsequence(str,newStr,index+1);
		
	}
	
	public static void main(String[] args) {

		String str = "abc";
		
		subsequence(str,"",0);

	}

}
