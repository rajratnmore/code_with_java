
package DSA_programs;
import java.util.*;
import java.util.Arrays;

class Practice {
	
	static void fun(String str) {
		
		String newStr[] = new String[str.length()*(str.length()+1)/2];
		int count=0;
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i; j<str.length(); j++) {
				newStr[count++] = str.substring(i,j+1);				
			}
			
		}
		
		System.out.println("Subsets are");
		
		for(String i : newStr)
			System.out.println(i);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[] {1,2,3,2,5,4,3,6,7,8,9,8};
		String str = "FUN";
		str = str.toLowerCase();
		fun(str);		
		
	}
}
