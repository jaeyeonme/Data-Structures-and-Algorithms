package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Java_2667_BFS {
    static int[] goX = {-1, 0, 1, 0};
    static int[] goY = {0, 1, 0, -1};
    static int[][] map;

    static int BFS (int n, int x, int y, int[][] map) {
        Queue<int[]> Q = new LinkedList<>();
        int cnt = 0;
        Q.add(new int[] {x, y});  // x, y 저장
        map[x][y] = 0;

        while (!Q.isEmpty()) {
            int curX = Q.peek()[0];  // 현재 x, y 위치
            int curY = Q.peek()[1];  //
            Q.poll();  // peek : 참조, 꺼내지 않는다. / poll : 꺼냄
            cnt++;     // 집 수 증가

            for (int i = 0; i < 4; i++) {
                int nx = curX + goX[i];  // 상하좌우 검사
                int ny = curY + goY[i];

                // map 범위 안
                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (map[nx][ny] == 1) {
                        Q.add(new int[]{nx, ny});
                        map[nx][ny] = 0;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지도의 크기
        int n = Integer.parseInt(br.readLine());

        String strMap;
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            // 지도 입력
            strMap = br.readLine();
            for (int j = 0; j < n; j++) {
                // 0을 빼줘야 숫자가 됨
                map[i][j] = strMap.charAt(i) - '0';
            }
        }
        br.close();

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    // 탐색 결과 저장
                    q.add(BFS(n, i, j, map));
                }
            }
        }
        System.out.println(q.size());
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
