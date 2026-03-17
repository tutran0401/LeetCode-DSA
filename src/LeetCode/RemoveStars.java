package LeetCode;

import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> star = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            if(s.charAt(i) != '*'){
                star.push(s.charAt(i));
            }else {
                star.pop();
            }
        }
        StringBuilder rs = new StringBuilder();
        while (!star.isEmpty()){
            rs.append(star.pop());
        }
        return rs.reverse().toString();
    }
}
