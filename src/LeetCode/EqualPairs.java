package LeetCode;

import java.util.HashMap;

public class EqualPairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> rowMap = new HashMap<>();
        // luu tung hang vao Map
        for (int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]).append(",");
            }
            String rowKey = sb.toString();
            rowMap.put(rowKey,rowMap.getOrDefault(rowKey,0)+1);
        }
        int count = 0;
        // duyet cac cot de so sanh voi tung mang
        for(int j=0;j<n;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(grid[i][j]).append(",");
            }
            String colKey = sb.toString();
            if(rowMap.containsKey(colKey)){
                count+=rowMap.get(colKey);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid ={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
}
