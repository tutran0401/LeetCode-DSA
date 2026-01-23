package LeetCode;

public class MaxArea {
            public int maxArea(int[] height) {
                int n = height.length;
                int right = n - 1;
                int left = 0;
                int max = 0;
                while (left < right) {
                    int aRea = (right - left) * (Math.min(height[right], height[left]));
                    max = Math.max(aRea, max);
                    if (height[left] < height[right]) {
                        left++;
                    } else {
                        right--;
                    }
                }
                return max;
            }

}
