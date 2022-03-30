package java_programs;
import java.util.*;

public class ToweOfHanoi {
	static int count = 0;
	static void towerOfHanoi(int n,String src,String helper,String dest) {
		count++;
		if(n == 1) {
			System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of disks into tower");
		int n=sc.nextInt();
		
		towerOfHanoi(n, "S","H","D");
		System.out.println("count is "+count);

	}

}
