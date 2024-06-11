package Data_Structure.Array.Cracking_Coding_Interview;// for permutation length of both string should be same. and the count of each character in both string shold be same.
//1. HashMap
//2. Array with length of ASCII characters set.

import java.util.Arrays;

// for permutation length of both string should be same. and the count of each character in both string shold be same.
//1. HashMap
//2. Array with length of ASCII characters set.

class CheckPermutation{
	public static void main(String []args){
		String str1="abcda";
		String str2="dcbaa";
		System.out.println(checkPermutation(str1,str2));
	}
	
	public static boolean checkPermutation(String str1, String str2){
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2){
			return false;
		}
		int []array=new int[26];
		for(int i=0;i<n1;i++){
			int index=str1.charAt(i)-'a';
			array[index]++;
		}
		System.out.println(Arrays.toString(array));
		for(int i=0;i<n2;i++){
			int index=str2.charAt(i)-'a';
			array[index]--;
			if(array[index]<0){
				return false;
			}
		}
		System.out.println(Arrays.toString(array));
		return true;
	}
}

// TC: O(n)
// TC: O(26)