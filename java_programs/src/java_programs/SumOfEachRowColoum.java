package java_programs;

public class SumOfEachRowColoum {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		int first=0;
		int second=0;
		int third=0;
		for(int i=0; i<arr.length; i++) {
			int rowCount=0;
			int columnCount=0;
			for(int j=0; j<arr[0].length; j++) {
				columnCount+=arr[j][i];
				rowCount+=arr[i][j];				
			}
			System.out.println(" row count is "+rowCount);
			System.out.println(" column count is "+columnCount);
		}
		
	}

}
