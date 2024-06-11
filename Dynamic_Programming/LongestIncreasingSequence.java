package Data_Structure.Dynamic_Programming;

public class LongestIncreasingSequence {
    public static void main(String[]args){
        int[]input={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int n=input.length;
        int []result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(input[i]>input[j]){
                    result[i]=Math.max(result[i],result[j]+1);
                }
            }
            ans=Math.max(ans,result[i]);
        }

        System.out.println(ans);
    }
}
