package java_programs;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{1,0,0},
			{0,1,0},
			{0,0,1}
		};
		
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i == j && arr[i][j] != 1) {
					flag = false;
					break;					
				}
				if(i != j && arr[i][j] != 0) {
					flag = false;
					break;	
				}
			}
		}
		
		if(flag)
			System.out.println("Given Matrix is Indetity");
		else
			System.out.println("Given Matrix is not Indetity");
		
	}

}
