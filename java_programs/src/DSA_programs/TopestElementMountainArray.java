package DSA_programs;

public class TopestElementMountainArray {

	// Peek toppest element in mountain array
	static int topElementInArray(int arr[]){
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start) / 2;
		
		while(start < end) {
			
			if(arr[mid] > arr[mid-1])
				start  = mid + 1;
			else
				end = mid;
			
			mid = start + (end - start) / 2;
		}
		return --start;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {2,3,4,5,9,10,11,21,42,3};
		int ans = topElementInArray(arr);
		
		System.out.println("topest element is "+arr[ans]);
	}

}
