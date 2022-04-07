package java_programs;
import java.util.*;

public class FrequencyOfArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,8,3,2,2,2,5,1};
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			mp.put(arr[i],0);
		}

		
		for(int i=0; i<arr.length; i++) {
			for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
				if(arr[i] == e.getKey()) {
					mp.put(arr[i], e.getValue()+1);
				}
			}
		}
		System.out.println(mp);
	}

}
