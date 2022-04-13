package java_programs;
import java.util.*;

public class RemoveDuplicateElement {

	// using loop
	static void removeDuplicateElementFirst(int arr[]) {
		int count = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != -1) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j] != -1) {
						if(arr[i] == arr[j]) {
							arr[j] = -1;
							count++;
						}
					}
				}
			}
		}
		
		int arr1[] = new int[arr.length-count];
		int j=0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != -1) {
				arr1[j] = arr[i];
				j++;
			}
		}
		
		System.out.println();
		for(int i : arr1)
			System.out.print(" "+i);
		
	}
	
	// using collection
	static void removeDuplicateElementSecond(int arr[]) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : arr)
			set.add(i);
		System.out.println(set);
		
	}
	       
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {10,20,20,30,30,40,50,50};
		removeDuplicateElementSecond(arr);
	}

}
