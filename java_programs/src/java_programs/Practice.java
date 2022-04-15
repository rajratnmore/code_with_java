package java_programs;
import java.util.*;
import java.util.Arrays;

public class Practice {	
	
	static void insertionFirst(int arr[]) {
		
		for(int round=0; round<arr.length-1; round++) {
			for(int i=round+1; i>0; i--) {
			
				if(arr[i] < arr[i-1]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}else
					break;
			}			
		}
		
		System.out.println(); 
		for(int a : arr) {
			System.out.print(" "+a);
		}
		
	}
	
	static void insertionSecond(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			for(; j>=0; j--) {
				
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
				}else
					break;
				
			}
			arr[j+1] = temp;
			
		}
		
		System.out.println(); 
		for(int a : arr) {
			System.out.print(" "+a);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {10,1,7,4,8,2,11};
		
		insertionSecond(arr);			
		
	}
}
