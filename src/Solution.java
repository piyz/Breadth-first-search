import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        /*
                    0
                   / \
                  1   2
                     / \
                    3   4
                   / \
                  5   6
         */

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(0);

        int[][] a = {
                {0,1,1,0,0,0,0},
                {1,0,0,0,0,0,0},
                {1,0,0,1,1,0,0},
                {0,0,1,0,0,1,1},
                {0,0,1,0,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,1,0,0,0}
        };

        while (!queue.isEmpty()){
            System.out.println(queue);
            int k = queue.poll();
            list.add(k);
            for (int i = 0; i < 7; i++) {
                if (a[k][i] == 1){
                    if (!list.contains(i)){
                        queue.add(i);
                    }
                }
            }
        }
    }
}
