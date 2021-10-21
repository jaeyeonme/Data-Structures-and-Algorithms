package Array;

import java.util.Scanner;

/**
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여졌습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
 * ...
 */
class Peaks {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int soluton (int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Peaks T = new Peaks();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.soluton(n, arr));
    }
}
