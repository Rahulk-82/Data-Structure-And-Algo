package Data_Structure.Array.StriversAtoZ.Array;

public class PrintArrayWithMaxSum {

    public static void main(String []args){

        int [] input={-2,1,-3,4,-1,2,1,-5,4};
        int start=0;
        int end=0;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
            if(ans<sum){
                end=i;
                ans=sum;
            }
            if(sum<0){
                start=i+1;
                sum=0;
            }
        }
        for(int i=start;i<=end;i++){
            System.out.print(input[i]+",");
        }
    }

}
