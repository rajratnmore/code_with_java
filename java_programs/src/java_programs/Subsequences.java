package java_programs;
import java.util.*;

public class Subsequences {

	static void subsequence(String str,String newStr,int index,HashSet<String> set) {
		
		if(index == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(index);
		
		subsequence(str,newStr+currChar,index+1,set);
		
		subsequence(str,newStr,index+1,set);
		
	}
	
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		String str = "abc";
		
		subsequence(str,"",0,set);

	}

}
