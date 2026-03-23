package LeetCode;

import java.util.Stack;

public class DecodeString {
//    public String decodeString111(String s) {
//        Stack<Integer> countStack = new Stack<>();
//        Stack<String> stringStack = new Stack<>();
//        String current = "";
//        int k = 0;
//
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c)) {
//                k = k * 10 + (c - '0'); // xử lý số nhiều chữ số
//            } else if (c == '[') {
//                countStack.push(k);
//                stringStack.push(current);
//                k = 0;
//                current = "";
//            } else if (c == ']') {
//                int repeat = countStack.pop();
//                String prev = stringStack.pop();
//                current = prev + current.repeat(repeat);
//            } else {
//                current += c;
//            }
//        }
//        return current;
//    }

    public static String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> intString = new Stack<>();
        String current = "";
        int k = 0;
        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) {
                k = k * 10 + (a - '0');
            } else if (a =='['){
                intString.push(k);
                stringStack.push(current);
                k=0;
                current="";
            }else if (a ==']'){
                int repeat = intString.pop();
                String prev =stringStack.pop();
                current=prev+ current.repeat(repeat);
            }else {
                current+=a;
            }
            }
        return current;
        }

    public static void main(String[] args) {
        String a = "2[abc]3[cd]ef";
        System.out.println(decodeString(a));
    }
    }
