package LeetCode;

public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        // mảng a = [0,1,1,1,0,1,1,0,1]
        int n = nums.length;
        int left=0;
        int maxLent=0;
        int zeros=0;
        for(int right =0; right<n; right++){
            if(nums[right]==0){
                zeros++;
            }
            while (zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            maxLent = Math.max(maxLent,right-left);
        }
        return maxLent;
    }
}
