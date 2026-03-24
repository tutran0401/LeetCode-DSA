package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue ;
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t-3000){
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));     // expect: 1
        System.out.println(rc.ping(100));   // expect: 2
        System.out.println(rc.ping(3001));  // expect: 3
        System.out.println(rc.ping(3002));  // expect: 3

        // test thêm
        System.out.println(rc.ping(7000));  // expect: 1 (chỉ còn 7000)
        System.out.println(rc.ping(8000));  // expect: 2 (7000, 8000)
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
