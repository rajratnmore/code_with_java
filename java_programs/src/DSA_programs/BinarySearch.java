package DSA_programs;

public class BinarySearch {
	
	// Binary Search Function	
	static int searchElement(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start) /2;
		int base = arr[start];
		while(start < end) {
			
			if(arr[mid] >= base)
				start = mid+1;
			else
				end =  mid;
			
			mid = start + (end - start) /2;				
			
		}
		return mid;
	}	
	

	public static void main(String[] args) {
		
		int arr[] = new int[] {9,10,11,12,16,18,19,3,4,6,7,8};
		
		int ans = searchElement(arr);
		
		System.out.println("topest element at index ");
		System.out.print(" "+arr[ans]);

	}

}
