package Data_Structure.Array.Scaler.Intermediate;

import java.util.Arrays;

class RotateArrayKTime{
	public static void main(String []args){
		int [] array={1,2,4,6,2,4,9};
		int k=3;
		int n=array.length;
		rotateArrayKTime(array,0,n-1);
		rotateArrayKTime(array,0,k-1);
		rotateArrayKTime(array,k,n-1);
		System.out.print(Arrays.toString(array));
	}
	
	public static void rotateArrayKTime(int[]array,int start,int end){
		while(start<=end){
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		
	}
	
}