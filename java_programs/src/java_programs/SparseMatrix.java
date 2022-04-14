package java_programs;

public class SparseMatrix {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{1,0,0},
			{0,1,0},
			{1,0,1}
		};
		
				
		int size = (arr.length * arr[0].length)/2,count=0;		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j] == 0)
					count++;
			}
		}
		
		if(count > size)
			System.out.println("This matrix is Sparse matrix");
		else
			System.out.println("This matrix is not Sparse matrix");
	}

}
