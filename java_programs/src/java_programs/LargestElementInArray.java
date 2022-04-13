package java_programs;
import java.util.*;
import java.util.Arrays;


public class LargestElementInArray {
	
	// Using Loop
	
	static void largestElementFirst(int arr[]) {
		int max=0;
		for(int i=1; i<arr.length; i++) 
			max = Math.max(max, arr[i]);
		
		System.out.println(max);	 			
		
	}
	
	// Using Recursion
	
	static int max;
	
	static void largestElementSecond(int arr[]) {
		if(arr.length<1) {
			System.out.println("max is "+max);
			return;
		}
		if(max<arr[0])
			max = arr[0];
		largestElementSecond(Arrays.copyOfRange(arr, 1, arr.length));
	}
	
	// Using Collection
	
	static void largestElementThird(int arr[]) {
		
		List<Integer> li = new ArrayList<>();
		for(int i: arr)
			li.add(i);
		
//		Collections.sort(li);
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {15,66,78,95,33,1};
		
		largestElementFirst(arr);
		

		
	}

}
