package java_programs;

import java.util.Arrays;

public class StringPrograms {
	
	// count number of vowels and consonants in string
	static void countVowelConsonants(String str) {
		int count=0;
		int vowels = 0;
		int consonants = 0;
		String vowel = "aeiou";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				boolean flag = true;
				for(int j=0; j<vowel.length(); j++) {
					if(str.charAt(i) == vowel.charAt(j)) {
						vowels++;
						flag = false;
						break;
					}						
				}				
				if(flag)
					consonants++;
			}
		}
		System.out.println("vowel are "+vowels+" consonants are "+consonants);
	}

	// Find String is anagram or not
	static void isAnagramFirst(String str1,String str2) {
		
		if(str1.length() == str2.length()) {
			boolean flag=false;
			
			for(int i=0; i<str1.length(); i++) {
				flag=false;
				for(int j=0; j<str2.length(); j++) {
					char first = str1.charAt(i);
					char second = str2.charAt(j);
					if(first == second || ( (first-second == 32) || (first-second == -32) )) {
						flag=true;
						break;
					}
				}
				if(!flag) 
					break;
			}
			if(flag) 
				System.out.println("Stings are anagram");
			else
				System.out.println("Stings are not anagram");
		}else 
			System.out.println("Stings are not anagram");
		
	}
	
	// String is Anagram or not
	static void isAnagramSecond(String str1,String str2){
		
		if(str1.length() != str2.length()) {
			System.out.println("String is not anagram");
			return;
		}
					
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i] != ch2[i]) {
				System.out.println("String is not anagram");
				return;
			}				
		}
		System.out.println("String is anagram");
	}
	
	public static void main(String[] args) {
		
		String str = "This is a really simple sentence";

		isAnagramSecond("Rajratn","Hiralal");
	}

}
