package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaxOperations {
    // cách 1 dùng two point + sort
    public static int maxOperations(int[] nums, int k) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int result = 0;
        Arrays.sort(nums);
        while (right > left) {
            if (nums[left] + nums[right] == k) {
                result++;
                right--;
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            }
        }
        return result;
    }

    // dùng set
    public static int maxOperations2(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();
        int count = 0;
        for (int x : nums) {
            int y = k - x;
            if (maps.getOrDefault(y, 0) > 0) {
                count++;
                maps.put(y, maps.get(y) - 1);
            } else {
                maps.put(x, maps.getOrDefault(x, 0) + 1);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        System.out.println(maxOperations2(nums, k));
    }
}
