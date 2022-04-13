package java_programs;
import java.util.*;

public class RightRotateArray {
	
	// using loop
	static void rightRotateArrayFirst(int arr[],int round) {
		while(round != 0) {
			for(int i=1; i<arr.length; i++) {
				int temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
			round--;
		}
		
		
		System.out.println("Rotated array is ");
		for(int i : arr)
			System.out.print(" "+i);
	}
	
	// using recursion 
	static void rightRotateArraySecond(int arr[],int round) {
		
		if(round  == 0) {
			System.out.println("\nusing recursion");
			for(int i : arr)
			System.out.print(" "+i);
			return;
		}
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
		}
		rightRotateArraySecond(arr,round-1);
	}
	
	// using collection 
	static void rightRotateArrayThird(int arr[],int round) {
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for(int i : arr)
			q.offer(i);
		for(int i=0; i<round; i++) {
			int ele = q.pollLast();
			q.offerFirst(ele);
		}
		System.out.println("collection "+q);
		
		
		
	}
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
//		rightRotateArrayFirst(arr,2);
		
//		rightRotateArraySecond(arr,1);
		
		rightRotateArrayThird(arr,1);
	}

}
 