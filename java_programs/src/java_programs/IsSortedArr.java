package java_programs;
import java.util.*;

public class IsSortedArr {
	
	static boolean isSorted(int arr[],int index) {
		
		if(index == arr.length-1)
			return true;
		
		if(arr[index] < arr[index+1])
			//array is sorted
			return isSorted(arr,++index);
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		int arr[] = new int[5];
		for(int i=0; i<5; i++)
			arr[i] = sc.nextInt();
		
		if(isSorted(arr,0))
			System.out.println("Array is sorted Strictly");
		else
			System.out.println("Array is not sorted Strictly");
		sc.close();

	}

}
