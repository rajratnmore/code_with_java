package java_programs;
import java.util.*;
import java.util.Arrays;

public class SortArray {
	
	// using selection sort
	static void sortFirst(int arr[]) {		
		
		for(int round=0; round<arr.length-1; round++) {
			
			for(int i=round+1; i<arr.length; i++) {
				if(arr[round] > arr[i]) {
					int temp = arr[round];
					arr[round] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println("array is sorted in accending order");
		for(int i : arr)
			System.out.print(" "+i);
		
	}
	
	// using bubble sort with Recursion
	static int loop = 1;
	static int r = 1;
	static void sortSecond(int arr[]) {
		
		if(r >=arr.length) {
			System.out.println();
			for(int i : arr)
				System.out.print(" "+i);
			return;
		}
		
		for(int i=0; i<arr.length-r; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		++r;
		sortSecond(arr);
	}
	
	// using collections
	static void sortThird(int arr[]) {
//		Integer ar[] = new Integer[arr.length];
//		for(int i=0; i<arr.length; i++)
//			ar[i] = arr[i];
//		
		Arrays.sort(arr);
		for(int i : arr)
			System.out.print(" "+i);
		
		System.out.println("\nThird largest Number is "+arr[2]);
		
	}
	
	
	public static void main(String[] args) {

		int arr[] = new int[] {87,99,62,3,5,88,4,26,25};
		sortThird(arr);
		
	}

}
