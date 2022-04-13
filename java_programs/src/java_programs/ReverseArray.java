package java_programs;
import java.util.*;
import java.util.Arrays;

public class ReverseArray {
	
	// first way of solving this problem
	static void reverseOrderArrayFirst(int arr[]){
		for(int i=1; i<arr.length; i = i+2) {
			System.out.print(" "+arr[i]);			
		}
	}

	// Second way using Recursion
	
	static void reverseOrderArraySecond(int arr[]) {
		if(arr.length < 1)
			return;
		reverseOrderArrayFirst(Arrays.copyOfRange(arr, 1, arr.length));
		System.out.print(" "+arr[0]);
	}
	
	// Second way using Collection
	
	static void reverseOrderArrayThird(int arr[]) {
		
		Stack<Integer> q = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			q.push(arr[i]);
		}
		for(int i=0; i<q.size(); i++)
			System.out.print(" "+q.pop());
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {15,62,84,85,66,7};
		reverseOrderArrayFirst(arr);
		
//		reverseOrderArraySecond(arr);

//		reverseOrderArrayThird(arr);
	}

}
