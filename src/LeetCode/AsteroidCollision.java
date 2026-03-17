package LeetCode;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {

                if (Math.abs(stack.peek()) < Math.abs(a)) {
                    stack.pop(); // asteroid trong stack nổ
                    continue;
                }
                else if (Math.abs(stack.peek()) == Math.abs(a)) {
                    stack.pop(); // cả hai nổ
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true; // asteroid mới nổ
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}
