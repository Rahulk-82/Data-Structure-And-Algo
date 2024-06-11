package Data_Structure.Subarray;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSum {
    public static void main(String[]args){
        int [] input={1,2,3};
        int n=input.length;
        int sum=0;
        int ans=0;
        int requiredSum=3;

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=input[i];
            int rem=sum-requiredSum;
            if(map.containsKey(rem)){
                ans+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        System.out.println(ans);

    }
}
