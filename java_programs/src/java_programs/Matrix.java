package java_programs;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {

		int arr1[][] = new int[][] {
			{8,8,8,8},
			{8,8,8,8},
			{8,8,8,8},
			{8,8,8,8}
		};
		int arr2[][] = new int[][] {
			{8,8,8,8},
			{8,8,8,8,8,8},
			{8,8,8}			
		};
		
		int arr3[][] = new int[][] {
			{5,5,5,5},
			{5,5,5,5,5,5},
			{5,5,5}				
		};
		boolean flag = true;
		if(arr1.length == arr2.length) {
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i].length != arr2[i].length) {
					flag = false;
					break;
				}
					
				for(int j=0; j<arr1[i].length; j++) {
					if(arr1[i][j] != arr2[i][j]) {
						flag = false;
						break;
					}
				}		
			}
			
		}else
			flag = false;
			
		
		if(flag)
			System.out.println("matrix are equal");
		else
			System.out.println("matrix are not equal");
		
		
	}

}
