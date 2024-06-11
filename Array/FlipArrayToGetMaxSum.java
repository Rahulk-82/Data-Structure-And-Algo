package Data_Structure.Array;

// kadens algo:
// if number is 0 then add one to sum.
// else if number is negative then subtract 1 from sum.
// start to track the start index of sub-array.
public class FlipArrayToGetMaxSum {
    public static void main(String[]args){
        String s="00000";
        int []result=flipArray(s);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+", ");
        }
    }
    public static int[] flipArray(String s){
        int n=s.length();
        int countzeros=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                countzeros++;
            }
        }
        if(countzeros==0){
            return new int[]{};
        }
        int sum=0;
        int ans=0;
        int left=0;
        int right=n-1;
        int start=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                sum+=1;
            }
            else{
                sum-=1;
            }
            if(sum>ans){
                ans=sum;
                left=start;
                right=i;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        return new int[]{left+1,right+1};

    }
}
