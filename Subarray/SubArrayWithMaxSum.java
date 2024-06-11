package Data_Structure.Subarray;

public class SubArrayWithMaxSum {
    public static void main(String []args){
        int[]input=new int[]{2,34,5,2,4,-1,-19,4};
        int n=input.length;
        int sum=0;
        int ans=input[0];
        for(int i=0;i<n;i++){
            sum+=input[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
