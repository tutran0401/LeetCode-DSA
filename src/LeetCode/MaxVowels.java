package LeetCode;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        int n = s.length();
        String vowels ="euoai";
        int count =0;
        for(int i=0;i<k;i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        int maxCount=count;
        for(int i =k;i<n;i++){
            if(vowels.indexOf(s.charAt(i-k))!= -1){
                count--;
            }
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++;
            }
            maxCount =Math.max(maxCount,count);
        }
        return maxCount;
    }
}
