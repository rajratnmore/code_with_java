package java_programs;
import java.util.*;
import java.util.Arrays;

public class SumOfArray {
	
	// using loop
	static void sumOfArrayFirst(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		System.out.print("sum of array is "+sum);
	}
	
	// using Recursion
	static int sumOfArraySecond(int arr[]) {
		if(arr.length < 2)
			return arr[0];
		return arr[0]+sumOfArraySecond(Arrays.copyOfRange(arr, 1, arr.length));
		
	}
	
	// using collection
	static void sumOfArrayThird(int arr[]) {
		Queue<Integer> q = new LinkedList<>();
		for(int i : arr)
			q.offer(i);
		int sum = 0;
			
		while(q.size() > 0) {
			sum += q.poll();
		}
		System.out.println("coollection "+sum);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {87,77,48,56,21,3};
		
		sumOfArrayFirst(arr);
		
		int ans = sumOfArraySecond(arr);
		System.out.println("\nrecursion "+ans);
		
		sumOfArrayThird(arr);
	}

}
