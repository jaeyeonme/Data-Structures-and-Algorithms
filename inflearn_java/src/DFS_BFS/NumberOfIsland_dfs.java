package DFS_BFS;

/**
 * m*n binary grid가 주어집니다. 각 cell의 값 중에 '1'은 땅이고 '0'은 물입니다.
 * 섬은 물에 의해 둘러싸입니다.
 * ...
 */
public class NumberOfIsland_dfs {

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '1', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '1', '1', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };

//        char[][] grid = {
//                { '1', '0' },
//                { '1', '1' } };

        NumberOfIsland_dfs a = new NumberOfIsland_dfs();
        System.out.println(a.solve(grid));
    }

    int m, n;
    int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, - 1} };
    int count = 0;

    public int solve (char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        m = grid.length;     // 4
        n = grid[0].length;  // 5

        // greedy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    DFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void DFS (char[][] grid, int i, int j) {

        // ERROR Check
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1')
            return;

        grid[i][j] = 'X';  // Visited

        for (int[] dir : dirs)
            DFS (grid, i + dir[0], j + dir[1]);
    }
}
