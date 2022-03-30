package java_programs;
import java.util.*;

public class FindOccurance {

	static int first = -1, last = -1;
	static boolean flag = true;
	
	static void findOccarance(String str,char ch,int index) {
		if(index == str.length())
			return;
		
		if(str.charAt(index) == ch) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			}
		}
		findOccarance(str,ch,index+1);
		if(flag) {
			System.out.println("first and last occarance is "+first+" "+last);
			flag=false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Find character");
		char ch = sc.next().charAt(0);
		findOccarance(str,ch,0);
		sc.close();

	}

}
