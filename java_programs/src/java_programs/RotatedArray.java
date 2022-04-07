package java_programs;
import java.util.*;

public class RotatedArray {
	
	// First way of solving this problem	
	static void rotateOne(int arr[],int rotateTimes) {
		int fr[] = new int[arr.length];				
		
		for(int i=0; i<fr.length; i++) {
			if(rotateTimes == arr.length)
				rotateTimes=0;
			fr[i] = arr[rotateTimes];
			rotateTimes++;
		}
		
		for(int i=0; i<fr.length; i++)
			System.out.print(" "+fr[i]);
	}
	
	
	// Second way of solving this problem	
	static void rotateTwo(int arr[],int rotateTimes) {
		
		for(int i=0; i<rotateTimes; i++) {
			int j=0,first= arr[0];
			
			for(j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);
		
	}
	
	
	// Third way of solving this problem
	static void rotateThree(ArrayDeque<Integer> q,int rotateTimes) {
		for(int i=0; i<rotateTimes; i++) {
			int ans = q.pollFirst();
			q.offer(ans);
		}
		
		System.out.print(q);
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
//		rotateTwo(arr,2);
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for(int i=1; i<=5; i++) {
			q.offer(i);
		}

		rotateThree(q,2);
		
	}

}
