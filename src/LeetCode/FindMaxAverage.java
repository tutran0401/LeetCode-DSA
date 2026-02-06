package LeetCode;

public class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sumWindow = 0;
        for (int i = 0; i < k; i++) {
            sumWindow += nums[i];
        }
        int maxSum = sumWindow;
        for (int i = k; i < n; i++) {
            sumWindow = sumWindow - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sumWindow);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println("Max average subarray of length " + k + " = " + result);
    }
}
