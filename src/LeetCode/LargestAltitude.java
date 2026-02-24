package LeetCode;

public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int max =  0;
        int maxAtatutide=0;
        for(int a :gain){
            max+=a;
            maxAtatutide= Math.max(max,maxAtatutide);

        }
        return maxAtatutide;
    }
}
