package Data_Structure.Array;

public class MaxProductOfTwoElement {

    public static void main(String [] args){
        int []input=new int[]{-10, -3, 5, 6, -2};
        int max1=input[0];
        int max2=Integer.MIN_VALUE;
        int min1=input[0];
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<input.length;i++){
            if(input[i]>max1){
                max2=max1;
                max1=input[i];
            }
            else if(input[i]>max2){
                max2=input[i];
            }

            if(input[i]<min1){
                min2=min1;
                min1=input[i];
            }
            else if (input[i]<min2) {
                min2=input[i];
            }
        }
        System.out.println(max2*max1>min2*min1?min2*max1:min1*min2);
    }



}
