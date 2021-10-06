package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * intervals 배열이 주어지면 겹치는 구간을 병합하여 배열을 반환 합니다.
 */
public class MergeInterval {
    public static void main(String[] args) {
        MergeInterval a = new MergeInterval();
        int[][] intervals = {
                { 1, 4 },
                { 8, 10 },
                { 2, 6 },
                { 15, 18 }
        };

        int[][] res = a.solve(intervals);
        for (int[] arr : res) {
            System.out.println("result");
            System.out.println(arr[0] + " : " + arr[1]);
        }
    }

    public int[][] solve(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        // 1. ds
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // 2. for while
        int start = intervals[0][0];
        int end = intervals[0][1];
        // start = 1, end = 4
        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
                // 2, 6 = > 1, 6
            } else {
                // 1, 6
                res.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[] {start, end});  // 15, 18
        return res.toArray(new int[res.size()][]);
    }

    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
