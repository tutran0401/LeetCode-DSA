package LeetCode;

import java.sql.Array;
import java.util.ArrayList;

/**
 * ý tưởng là để tính tích các phần tử của dãy mà không dùng phép chia
 * thì tính tích của các số trước số đấy ( số đầu tiên mặc định là 1)
 * tính tích các phần tử ở sau trừ nó số cuối thì là 1
 * nhân 2 mản ra mảng cần tìm
 * sai khi hieru on là chỉ chạy vòng lặp 1 lần  chứu chạy nhiều vòng lặp vân o(N)
 * tối ưu bằng cách không cần khởi tạo 2 mảng mới mà chỉ cần khởi tạo 2 biến suffix va preFix
 * xong prefix thì se khoi tạo la 1 chạy vòng lặp lần đầu mỗi lần xong thì gán luôn vào mảng trả ra
 * lưu ý prefix= prefix* nums[i]
 * tương tự thì
 *
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        int[] preFix = new int[nums.length];
        int[] suffix = new int[nums.length];
        preFix[0] = 1;
        for (int i = 1; i < n; i++) {
            preFix[i] = preFix[i - 1] * nums[i - 1];
        }
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            res[i] = preFix[i] * suffix[i];
        }
        return res;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int n=nums.length;
        int pres=1;
        int suffs=1;

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=pres;
            pres*=nums[i];
            System.out.println(pres);
        }
        print(arr);
        for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]*suffs;
            suffs*=nums[i];
            System.out.println(suffs);

        }
        return arr;
    }
    public static void print(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={ 1, 2, 3, 4};
        int [] a = productExceptSelf2(nums);

    }
}
