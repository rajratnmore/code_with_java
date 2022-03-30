package java_programs;
import java.util.*;

public class ReaverStringPrint {
	
	static void reverseString(String str) {
		if(str.length() == 1) {
			System.out.print(str.charAt(0));
			return;
		}
		reverseString(str.substring(1, str.length()));
		System.out.print(str.charAt(0));
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		reverseString(str);		
		sc.close();

	}

}
