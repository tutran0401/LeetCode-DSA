package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        //  vị trí để đặt số != 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        //sau khi đã đặt hết số !=0, điền 0 vào phần còn lại
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 2};
        moveZeroes.moveZeroes(nums);
        print(nums);
    }
}
