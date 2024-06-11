package Data_Structure.String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String []args){
        String s1="listen";
        String s2="silent";
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);
        }
        System.out.println(map1.equals(map2));
    }
    //TC: O(max(N,M)); SC: O(N+M)
}
