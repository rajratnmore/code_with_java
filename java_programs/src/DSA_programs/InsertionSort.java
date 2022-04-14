package DSA_programs;

public class InsertionSort {
	
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
		
		System.out.println("Sorted array is ");
		for(int a : arr) 
			System.out.print(" "+a);
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,1,7,4,8,2,11};
		
		insertionFirst(arr);
		

	}

}
