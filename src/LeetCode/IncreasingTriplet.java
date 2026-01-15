package LeetCode;

import java.util.Map;

public class IncreasingTriplet {
    // ý tưởng này sai vì không bao quát nó chỉ sét giữa tk nhỏ nahast và lớn nhất giả sử có mảng nhỏ hơn thỏa mãn thì nó vẫn thỏa mãn
    // ex:nums =
    //[20,100,10,12,5,13]
//    public static boolean increasingTriplet(int[] nums) {
//    boolean res =false;
//
//    int maxIndex=0;
//    int minIndex=0;
//    for(int i =1;i<=nums.length-1;i++){
//        if (nums[i]>nums[maxIndex]){
//            maxIndex=i;
//        }
//        if (nums[i]<nums[minIndex]){
//            minIndex=i;
//        }
//    }
//    if(maxIndex<=minIndex){
//        res=false;
//    }else {
//        for(int i= minIndex ;i<=maxIndex;i++){
//            if(nums[i]>nums[minIndex] && nums[i]<nums[maxIndex]){
//                res=true;
//                break;
//            }
//        }
//    }
//    return  res;
//    }
    //Ý tưởng khá hay.
    private static Boolean increasingTriplet(int[] nums) {
        int fist = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int a : nums) {
            if (a <= fist) {
                fist = a;
            } else if (a <= second) {
                second = a;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void print(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={20,100,10,12,5,13};
        Boolean a = increasingTriplet(nums);
        System.out.println(a);

    }


}


