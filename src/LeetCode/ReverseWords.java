package LeetCode;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder reponse = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i=words.length-1;i>=0;i--){
            reponse.append(words[i]);
            if(i>0){
                reponse.append(" ");
            }
        }
        return reponse.toString();
    }
}
