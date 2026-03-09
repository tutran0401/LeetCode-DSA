package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int a : arr){
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);
        }
        Set<Integer> set = new HashSet<>(hashMap.values());
        if(set.size()== hashMap.size()) return true;

        return false;
    }
}
