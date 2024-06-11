package Data_Structure.Subarray;

import java.util.HashMap;
import java.util.Map;

//Brute for approach will give TC: O(N^2) and SC: O(N)

public class CountSubStringWithDIfferentStartAndEndCharacter {
    public static void main(String [] args){
        String s="abcab";
        int n=s.length();
        int count=0;
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i = 0; i < n; i++)

            if (map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        for(int i=0;i<n;i++){
            count=0;
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                for(Map.Entry<Character,Integer> entry:map.entrySet()){
                    if(entry.getKey()!=s.charAt(i)){
                        count+=entry.getValue();
                    }
                }
            }
            ans+=count;
        }
        System.out.println(ans);
    }
}

// TC: O(N*26) ; SC: O(N)
