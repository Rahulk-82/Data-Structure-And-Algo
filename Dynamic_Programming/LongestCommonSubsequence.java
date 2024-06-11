package Data_Structure.Dynamic_Programming;

public class LongestCommonSubsequence {
    public static void main(String[]args){
        String s1="AGGTAB";
        String s2="GXTXAYB";
        int n1=s1.length();
        int n2=s2.length();
        int[][]dp=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n1][n2]);

    }
}
