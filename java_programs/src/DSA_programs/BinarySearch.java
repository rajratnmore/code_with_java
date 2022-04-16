package DSA_programs;

public class BinarySearch {
	
	// Binary Search Function	
	static int searchElement(int arr[],int element) {
		
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start) /2;
		
		while(start <= end) {
			
			if(element == arr[mid]) {
				return mid;
			}
			if(element > arr[mid])
				start = mid+1;
			else
				end = mid-1;
			
			mid = start + (end - start) /2;				
			
		}
		return -1;
	}	
	

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8};
		
		int ans = searchElement(arr,6);
		
		if(ans != -1)
			System.out.println("element is present at index "+ans);
		else
			System.out.println("element is not present ");

	}

}
