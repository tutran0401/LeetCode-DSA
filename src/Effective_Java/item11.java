package Effective_Java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class item11 {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        s.add("ádsadasdsadas");
        s.addAll(Arrays.asList(args));
        System.out.println(s);
    }
}
