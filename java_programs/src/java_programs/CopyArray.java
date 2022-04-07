package java_programs;

public class CopyArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {12,35,65,28,66};
		int arr1[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}

		System.out.println("\n Actual Array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("\n Copied Array");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(" "+arr1[i]);
		}
	}

}
