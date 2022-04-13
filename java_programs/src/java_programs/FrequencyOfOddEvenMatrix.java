package java_programs;

public class FrequencyOfOddEvenMatrix {
	
	static void freqencyOfOddEvenElement(int arr1[][]) {
		int even=0;
		int odd=0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i][j] % 2 == 0) 
					even++;
				else
					odd++;
			}
		}
		
		System.out.println("Even Freqency is "+even);
		System.out.println("Odd Freqency is "+odd);
	}

	public static void main(String[] args) {
		
		int arr[][] = new int[][] 	{
			{4, 1, 3},    
            {3, 5, 7},    
            {8, 2, 6}
		};
		
		freqencyOfOddEvenElement(arr);		

	}

}
