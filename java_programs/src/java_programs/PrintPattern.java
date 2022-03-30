package java_programs;
import java.util.*;

public class PrintPattern {
	
	static void printPat(int n) {
		for(int i=n; i>0; i--) {
			int value = n;
			for(int k=n; k>0; k--) {
				for(int j=0; j<i; j++) 
					System.out.print(value+" ");				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		printPat(n);
		
		sc.close();
	}

}
