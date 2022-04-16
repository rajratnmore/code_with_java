
package DSA_programs;

class Practice {
	
	static void fun(int arr[]) {
		
//		System.out.println("The array is ");
		int end = arr.length-1;
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;	
			end--;
		}
		
		System.out.println("Swapped array is ");
		for(int a : arr)
			System.out.print(" "+a);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,35,4,5,6,7,8};
		fun(arr);
		
				
	}
}
