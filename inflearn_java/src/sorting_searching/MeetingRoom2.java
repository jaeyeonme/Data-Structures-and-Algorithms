package sorting_searching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoom2 {
    public static void main(String[] args) {
        MeetingRoom2 a = new MeetingRoom2();
        int[][] intervals = { {5, 10}, {16, 20}, {0, 30} };
//      int[][] intervals = { {7, 10}, {2, 4} };
        System.out.println(a.solve(intervals));
    }

    public int solve(int[][] intervals) {

        // 1. ASC
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Queue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);  // end time 오름차순으로 관리

        // for pq
        for (int[] arr : intervals) {
            if (q.isEmpty()) q.offer(arr); // 0, 30  5, 10
            else {
                if (q.peek()[1] <= arr[0]) {
                    // 10  16
                    q.poll();
                }
                q.offer(arr);  // 16, 20
            }
        }
        return q.size();
    }
}
