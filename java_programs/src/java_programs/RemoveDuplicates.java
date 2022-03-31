package java_programs;

public class RemoveDuplicates {

	static void removeDuplicates(StringBuilder str,StringBuilder newStr,int index) {
		if(index == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		if(index == 0) {
			newStr.append(str.charAt(index));
			removeDuplicates(str,newStr,++index);
		}else {
			
			boolean flag = true;
			for(int i=0; i<newStr.length(); i++) {
				if(newStr.charAt(i) == str.charAt(index))
					flag = false;
			}
			
			if(flag) {
				newStr.append(str.charAt(index));
				removeDuplicates(str,newStr,++index);
			}else			
				removeDuplicates(str,newStr,++index);	
		}
		
	}
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("abbddddccda");
		StringBuilder newStr = new StringBuilder("");
		
		removeDuplicates(str,newStr,0);

	}

}
