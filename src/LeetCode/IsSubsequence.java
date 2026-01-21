package LeetCode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int conn= s.length();
        int n= t.length();
        if (conn == 0) return true;
         int count=0;
        for (int i=0;i<n;i++){
            if(conn>count && s.charAt(count)==t.charAt(i)){
                count++;
            }
        }
        if(count==conn){
            return true;
        }else return false;
    }
}
