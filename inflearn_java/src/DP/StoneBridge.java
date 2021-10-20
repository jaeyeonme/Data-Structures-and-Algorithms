package DP;

import java.util.Scanner;

/**
 * 철수는 학교에 가는데 개울을 만났습니다. 개울은 N개의 돌로 다리를 만들어 놓았습니다. 철수는 돌다디를 건널 때
 * ...
 */
class StoneBridge {
    static int[] dy;
    public int solution (int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[n - 2] + dy[n - 1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        StoneBridge T = new StoneBridge();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 2];  // 크기 0번부터 시작하므로.
        System.out.println(T.solution(n));
    }
}
