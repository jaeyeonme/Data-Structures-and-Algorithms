package DFS_BFS;

/**
 * 2차원배열 그리드가 0과 1인 경우, 1이 육지(섬) 0이 바다입니다.
 * 육지는 4방향으로 연결된 1의 그룹입니다. 그리드의 네 모서리 모두가 물로 둘러싸여 있다고 가정할 수 있습니다.
 * ...
 */
public class MaxOfIsland {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,0,1,1},
                {0,1,1,0,0},
                {0,0,0,0,0},
                {1,1,0,1,1},
                {1,0,1,1,1},
                {1,0,1,1,1}};

        MaxOfIsland a = new MaxOfIsland();
        System.out.println(a.maxAreaOfIsland(grid));
    }

    int[][] dirs = {{-1, 0}, {1,0}, {0,-1}, {0, 1}};
    int m, n;
    public int maxAreaOfIsland(int[][] grid) {

        // Null Check
        if (grid == null || grid.length == 0) return 0;
        m = grid.length;     // 가로 = 6
        n = grid[0].length;  // 세로 = 5
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {  // 육지일 때
                    int area = DFS(grid, i, j, 0);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    int DFS (int[][] grid, int x, int y, int area) {
        // 1. 탈출
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0)
            return area;

        // 2. 1인 육지가 들어오는 경우
        grid[x][y] = 0;
        area++;
        for (int[] dir : dirs) {
            area = DFS (grid, x + dir[0], y + dir[1], area);
        }
        return area;
    }
}
