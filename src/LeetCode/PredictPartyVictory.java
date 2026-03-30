package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        Queue<Integer> D = new LinkedList<>();
        Queue<Integer> R = new LinkedList<>();
        int n = senate.length();
        for(int i =0;i< senate.length();i++){
            if(senate.charAt(i) == 'R'){
                R.add(i);
            }else {
                D.add(i);
            }
        }
        while (!D.isEmpty() && !R.isEmpty()){
            int a =R.poll();
            int b =D.poll();
            if(a<b){
                R.add(a+n);
            }else {
                D.add(b+n);
            }
        }
        return R.isEmpty() ? "Dire":"Radiant";
    }
}
