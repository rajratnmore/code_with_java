package DSA_programs;

public class PivotElementInArray {

	static int pivotElement(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start) / 2;
		
		while(start < mid) {
			if(arr[mid] >= arr[0])
				start = mid + 1;
			else
				end = mid;
			mid = start + (end - start) / 2;
		}
		return start;			
	}
	
	public static void main(String[] args) {

		int arr[] = {7,8,9,10,11,3,4,5,6};
		int ans = pivotElement(arr);
		System.out.println("pivot element is "+arr[ans]);
	}

}
