package Data_Structure.Subarray;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithZeroSum {
    public static void main(String []args){
        int []input={0,0,5,5,0,0};
        int n=input.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=input[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(count);
    }
}
