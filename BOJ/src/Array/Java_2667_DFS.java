package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Java_2667_DFS {
    static int[] goX = {-1, 0, 1, 0};
    static int[] goY = {0, 1, 0, -1};
    static int cnt;

    static void DFS (int n, int x, int y, int[][] map) {
        map[x][y] = 0;
        cnt++;  // 집 수 증가

        for (int i = 0; i < 4; i++) {
            // 상하좌우 검사
            int nx = x + goX[i];
            int ny = y + goY[i];

            // map 범위 안
            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (map[nx][ny] == 1)
                    DFS (n, nx, ny, map);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지도의 크기
        int n = Integer.parseInt(br.readLine());

        String strMap;
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            // 지도 입력
            strMap = br.readLine();
            for (int j = 0; j < n; j++) {
                // 0을 빼줘야 숫자가 됨
                map[i][j] = strMap.charAt(j) - '0';
            }
        }
        br.close();
        // 오름차순이므로 우선순위 큐 선언
        PriorityQueue<Integer> Q = new PriorityQueue<>();

        // 탐색시작
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    // cnt 0으로 초기화
                    cnt = 0;
                    DFS (n, i, j, map);
                    // 탐색 횟수 저장
                    Q.add(cnt);
                }
            }
        }
        System.out.println(Q.size());
        while (!Q.isEmpty()) {
            System.out.println(Q.poll());
        }
    }
}
