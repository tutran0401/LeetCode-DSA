package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandiess{

    /**
     * Trả về danh sách boolean cho biết mỗi đứa trẻ
     * có thể trở thành người có nhiều kẹo nhất hay không
     * sau khi được cho thêm extraCandies.
     *
     * @param candies mảng số kẹo của từng đứa trẻ
     * @param extraCandies số kẹo bổ sung
     * @return danh sách boolean kết quả
     */
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            // TODO: Viết logic ở đây
            List<Boolean> reponse = new ArrayList<>();
            int maxCandies= maxCandies(candies);
            for (int candie : candies){
                int currentMaxCandies= candie + extraCandies;
                reponse.add(currentMaxCandies >= maxCandies);
            }
            return reponse;

        }
        public int maxCandies(int[] candies){
            int max=candies[0];
            for(int i=1;i<=candies.length-1;i++){
                if(candies[i]>=max){
                    max=candies[i];
                }
            }
            return max;
        }
        // tối ưu nhất
    // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    //        int max =0;
    //        for(int i=0;i<candies.length;i++){
    //            if(candies[i]>max)
    //            {
    //                max = candies[i];
    //            }
    //        }
    //        ArrayList<Boolean>result = new ArrayList<>(candies.length);
    //        for(int i=0;i<candies.length;i++){
    //            boolean kidswithMax = candies[i]+ extraCandies>=max;
    //            result.add(kidswithMax);
    //        }
    //        return result;
    //    }
}
