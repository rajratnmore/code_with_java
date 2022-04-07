package java_programs;
import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		
		System.out.println("enter array of 5");		
		for(int i=0; i<5; i++) {
			arr.add(sc.nextInt());
		}
		
		System.out.println(arr);
		
		arr1.addAll(arr);
		
		System.out.println(arr1);
		
//
//		System.out.println("\n Actual Array");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(" "+arr[i]);
//		}
//		
//		System.out.println("\n Copied Array");
//		for(int i=0; i<arr1.size(); i++) {
//			System.out.print(" "+arr1.get(i));
//		}
	}

}
