package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * m*n binary grid가 주어집니다. 각 cell의 값 중에 '1'은 땅이고 '0'은 물입니다.
 * 섬은 물에 의해 둘러싸입니다.
 * ...
 */
public class NumberOfIsland_bfs {

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '1', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '1', '1', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };

//        char[][] grid = {
//                { '1', '0' },
//                { '1', '1' } };

        NumberOfIsland_bfs a = new NumberOfIsland_bfs();
        System.out.println(a.solve(grid));
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;

    public int solve (char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        m = grid.length;     // 4
        n = grid[0].length;  // 5
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    BFS (grid, i, j);
                }
            }
        }
        return count;
    }

    public void BFS(char[][] grid, int x, int y) {
        grid[x][y] = 'X';  // visisted
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});  // 0,0

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int[] dir : dirs) {
                int x1 = current[0] + dir[0];  // 0 + x;
                int y1 = current[1] + dir[1];  // 0 + x;

                if (x1 >= 0 && y1 >= 0 && x1 < m && y1 < n && grid[x1][y1] != '1') {
                    grid[x1][y1] = 'X';  // 들어오는 순간 X
                    queue.offer(new int[] {x1, y1});
                }
            }
        }
    }
}
