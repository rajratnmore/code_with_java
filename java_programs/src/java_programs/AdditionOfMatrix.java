package java_programs;

public class AdditionOfMatrix {

	static void addionOfTwoMatrix(int arr1[][],int arr2[][],int arr3[][]) {
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Matrix Additon is");
		for(int a[] : arr3) {
			for(int b : a)
				System.out.print(" "+b);
			System.out.println();
		}		
		
	}
	
	static void substractionOfTwoMatrix(int arr1[][],int arr2[][],int arr3[][]) {
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		
		System.out.println("Matrix Substraction is");
		for(int a[] : arr3) {
			for(int b : a)
				System.out.print(" "+b);
			System.out.println();
		}		
		
	}
	
	
	static void divisionOfTwoMatrix(int arr1[][],int arr2[][],int arr3[][]) {
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] / arr2[i][j];
			}
		}
		
		System.out.println("Matrix Division is");
		for(int a[] : arr3) {
			for(int b : a)
				System.out.print(" "+b);
			System.out.println();
		}		
		
	}
	
	public static void main(String[] args) {
		
		int arr1[][] = new int[][] {
			{5,5,5,5},
			{5,5,5,5,5,5},
			{5,5,5}
		};
		int arr2[][] = new int[][] {
			{8,8,8,8},
			{8,8,8,8,8,8},
			{8,8,8}			
		};
		int arr3[][] = new int[][] {
			{0,0,0,0},
			{0,0,0,0,0,0},
			{0,0,0}			
		};
		
		
		addionOfTwoMatrix(arr1,arr2,arr3);
		substractionOfTwoMatrix(arr1,arr2,arr3);
		
		divisionOfTwoMatrix(arr1,arr2,arr3);
	}

}
