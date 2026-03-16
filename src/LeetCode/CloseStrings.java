package LeetCode;

import java.util.*;

public class CloseStrings {
    /*
            Input: word1 = "cabbba", word2 = "abbccc"
        Output: true
        Explanation: You can attain word2 from word1 in 3 operations.
        Apply Operation 1: "cabbba" -> "caabbb"
        Apply Operation 2: "caabbb" -> "baaccc"
        Apply Operation 2: "baaccc" -> "abbccc"
     */
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> wordd1 = new HashMap<>();
        for (char a : word1.toCharArray()) {
            wordd1.put(a, wordd1.getOrDefault(a, 0) + 1);
        }
        HashMap<Character, Integer> wordd2 = new HashMap<>();
        for (char a : word2.toCharArray()) {
            wordd2.put(a, wordd2.getOrDefault(a, 0) + 1);
        }
        // check character set
        if(!wordd1.keySet().equals(wordd2.keySet())){
            return false;
        }
        List<Integer> listWord1 = new ArrayList<>(wordd1.values());
        List<Integer> listWord2 = new ArrayList<>(wordd2.values());
        Collections.sort(listWord1);
        Collections.sort(listWord2);
        if (listWord1.equals(listWord2)) return true;
        return false;
    }

    public static void main(String[] args) {
        String a ="cabbba";
        String b = "abbccc";
        System.out.println(closeStrings(a,b));
    }
}
