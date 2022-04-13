package java_programs;

public class LowerTriangularMatrix {
	
	static void lowerTriangular(int arr1[][]) {
		
		System.out.println("Lower Triangular Matrix is");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(j <= i)
					System.out.print(" "+arr1[i][j]);
				else
					System.out.print(" 0");
			}
			System.out.println();
		}
		
	}
	
	static void upperTriangular(int arr1[][]) {
		
		System.out.println("Upper Triangular Matrix is");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(j >= i)
					System.out.print(" "+arr1[i][j]);
				else
					System.out.print(" 0");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1}
		};
		
		lowerTriangular(arr);
		upperTriangular(arr);
		
	}

}
