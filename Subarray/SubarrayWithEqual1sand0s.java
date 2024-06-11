package Data_Structure.Subarray;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithEqual1sand0s {
    public static void main(String[]args){
        int []input= {1, 0, 0, 1, 0, 1, 1};
        int n=input.length;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>(); // key->sum; value-> frequency of coming sum;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(input[i]==0) input[i]=-1;
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
