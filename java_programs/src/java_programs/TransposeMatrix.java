package java_programs;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int arr2[][] = new int[arr.length][arr[0].length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Normal matrix is ");
		for(int a[] : arr) {
			for(int b : a) 
				System.out.print(" "+b);
			System.out.println();
		}

		System.out.println("Transpose matrix is ");
		for(int a[] : arr2) {
			for(int b : a) 
				System.out.print(" "+b);
			System.out.println();
		}

		
	}

}
