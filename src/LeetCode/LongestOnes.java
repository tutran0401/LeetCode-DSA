package LeetCode;

public class LongestOnes {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int maxlen = 0;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
