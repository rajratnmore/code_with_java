package java_programs;

public class ProductOfMatrix {
	
	static void productOfMatrix(int arr1[][],int arr2[][],int arr3[][]) {
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				int ans=0;
				for(int k=0; k<arr1.length; k++) {
					ans = ans + arr1[i][k]*arr2[k][j]; 
				}
				arr3[i][j] = ans;
			}
		}
		
		System.out.println("Product of Two Matrix is");
		for(int a[] : arr3) {
			for(int b : a)
				System.out.print(" "+b);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		int arr1[][] = new int[][] {
			 {1, 3, 2},    
             {3, 1, 1},    
             {1, 2, 2}    
		};

		int arr2[][] = new int[][] {
			 {2, 1, 1},    
             {1, 0, 1},    
             {1, 3, 1}    
		};
		
		int arr3[][] = new int[][] {
			{0, 0, 0},    
			{0, 0, 0},    
			{0, 0, 0}
		};
		
		productOfMatrix(arr1,arr2,arr3);
	}

}
