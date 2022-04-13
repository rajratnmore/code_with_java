package java_programs;

public class BackTracking {

	static void printPermutation(String str, String per,int index) {
		
		if(str.length() == 0) {
			System.out.println(per);
			return;
		}
				
		for(int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			System.out.println("currChar is "+currChar);
			String newStr = str.substring(0, i) + str.substring(i+1);
			System.out.println("newStr is "+newStr);
			printPermutation(newStr,per + currChar, i+1);
		}
	}
	
	public static void main(String[] args) {
		
		String str = "ABC";
		
		printPermutation(str,"",0);

	}

}
