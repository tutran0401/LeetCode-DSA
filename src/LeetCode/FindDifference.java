package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> num11 = new HashSet<>();
        Set<Integer> num12 = new HashSet<>();
        for(int num : nums1){
            num11.add(num);
        }
        for(int num : nums2){
            num12.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : num11){
            if(!num12.contains(num)){
                list1.add(num);
            }
        }
        for (int num : num12) {
            if (!num11.contains(num)) {
                list2.add(num);
            }
        }
        result.add(list1);
        result.add(list2);
        return  result;
    }
}
