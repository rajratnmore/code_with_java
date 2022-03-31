package java_programs;
import java.util.*;

public class UniqueSubsequences {

	static void subsequence(String str,String newStr,int index,HashSet<String> set) {
		
		if(index == str.length()) {
			if(set.contains(newStr)) {
				return;
			}else {
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
		}
		
		char currChar = str.charAt(index);
		
		subsequence(str,newStr+currChar,index+1,set);
		
		subsequence(str,newStr,index+1,set);
		
	}
	
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		String str = "aaa";
		
		subsequence(str,"",0,set);

	}

}
