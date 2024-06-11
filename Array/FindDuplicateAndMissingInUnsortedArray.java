package Data_Structure.Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndMissingInUnsortedArray {
    public static void main(String []args){
        int[]input={1,3,4,2,8,4,5,6,1};
        int n=input.length;
        System.out.println("Repeating number:");
        for(int i=0;i<n;i++){
            int index=Math.abs(input[i])-1;
            if(input[index]>=0){
                input[index]=-input[index];
            }
            else{
                System.out.println(index+1);
            }
        }
        System.out.println("Missing number:");
        for(int i=0;i<n;i++){
            if(input[i]>0){
                System.out.println(i+1);
            }
        }


    }
}
