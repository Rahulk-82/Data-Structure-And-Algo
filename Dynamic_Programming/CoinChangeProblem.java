package Data_Structure.Dynamic_Programming;
//infinite supply of coins
public class CoinChangeProblem {
    public static void main(String []args){
        int [] coins=new int[]{1,2,5};
        int amount=11;
        int []dp=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i-coin>=0){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }

            }
        }
        int result=dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
        System.out.println(result);
    }
}
