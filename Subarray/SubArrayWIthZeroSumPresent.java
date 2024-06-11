package Data_Structure.Subarray;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWIthZeroSumPresent {
    public static void subarraywithzerosum(int[] input,int N){
        int n=input.length;
        int flag=0;
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
            if(sum==0){
                System.out.println(true);
                System.out.println("till index: "+i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(false);
        }

    }
    public static void main(String [] args){
        int[]input=new int[]{1,3,-3,-1,3,2,4,5,3};
        int N=0;
        subarraywithzerosum(input,N);
    }

}
