package sorting_searching;

import java.util.Arrays;

/**
 * 미팅 시간 배열이 주어집니다. Intervals배열을 이용하여 사람들이 모든 회의에
 * 참석할 수 있는지 boolean으로 리턴하세요.
 */
public class MeetingRoom {
    public static void main(String[] args) {

        MeetingRoom a = new MeetingRoom();
        int[][] intervals = { {5, 10}, {16, 20}, {0, 30} };
//      int[][] intervals = { {7, 10}, {2, 4} };

        System.out.println(a.solve(intervals));
    }

    public boolean solve(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return true;

        // 1. sorting
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);  // 오름차순

        // 2. for while
        int end = intervals[0][1];  // 0, 30
        for (int i = 1; i < intervals.length; i++) {
            // 5, 10
            if (intervals[i][0] < end) {
                return false;
            }
            end = intervals[i][1];
        }
        return true;
    }

    public void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
