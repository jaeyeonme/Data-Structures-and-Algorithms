package DP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다음과 같이 여러 단위의 동전들이 주어져 있을 떄 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가..?
 * ...
 */
class ChangeCoin {
    static int n, m;
    static int[] dy;
    public int solution (int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j < m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        ChangeCoin T = new ChangeCoin();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(T.solution(arr));
    }
}
